package org.framework.WebService;

import org.framework.Application;
import org.framework.JDBC.DAO.JobDAO;
import org.framework.JDBC.Model.Job;
import org.framework.Form.Model.Keymodel;
import org.framework.WebService.JSONModel.Report;
import org.framework.WebService.JSONModel.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.framework.Generators.Annotation.ConfigurationInfo;

import javax.validation.Valid;
import java.lang.reflect.Method;
import java.util.HashMap;

@RestController
public class ApplicationWebService {

    @Autowired
    private JobDAO jobDAO;

    private HashMap<Integer,String> collect = Application.getCollection();

    @Async
    @RequestMapping("/toGenerateReport")
    public Report toGenerateReport(@Valid @ModelAttribute("Keymodel")Keymodel keymodel){
        try{
            System.out.println(keymodel.getKeyId());
            if(keymodel.getKeyId()!=0) {
                Class<?> generateClass = Class.forName(collect.get(keymodel.getKeyId()));
                ConfigurationInfo confClass = generateClass.getAnnotation(ConfigurationInfo.class);
                long jobid = jobDAO.insertNewJob(new Job(confClass.type(), confClass.version(), "IN_PROGRESS"));
                Method method = generateClass.getMethod("toGenerateReport");
                method.invoke(generateClass);
                jobDAO.updateStatusById(jobid, "COMPLETE");
                return new Report(0, "REPORT_GENERATION_STARTED", jobid);
            }
            else {
                return new Report(200, "REQUIRED_PARAMETERS_ARE_NOT_SPECIFIED");
            }
        }
        catch(ClassNotFoundException ex){
            return new Report(400,"NOT_FOUND_THE_MODULE_FOR_GENERATING_THE_REPORT");
        }
        catch (Exception e){
            return new Report(100,"SYSTEM_ERROR");
        }
    }
    @Async
    @RequestMapping("/toCheckTheStatusOfReportGeneration")
    public Status toCheckTheStatusOfReportGeneration(@Valid @ModelAttribute("Keymodel")Keymodel keymodel){
        try {
            return new Status(jobDAO.getStatusById(keymodel.getJobId()));
        }
        catch (Exception ex){
            return new Status("FAILED");
        }
    }

    @Async
    @RequestMapping("/toCancelReportGeneration")
    public Status toCancelReportGeneration(@Valid @ModelAttribute("Keymodel")Keymodel keymodel){
        try {
            if(keymodel.getJobId()!=0) {
                return new Status(jobDAO.updateStatusById(keymodel.getJobId(),"CANCELLED"));
            }
            else{
                return new Status("JOB_NOT_FOUND");
            }
        }
        catch (Exception ex){
            return new Status("FAILED");
        }
    }

    @Async
    @RequestMapping("/toDownloadTheReport")
    public void toDownloadTheReport(){

    }
}