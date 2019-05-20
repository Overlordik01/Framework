package org.framework.WebService;

import org.framework.JDBC.DAO.JobDAO;
import org.framework.JDBC.Model.Job;
import org.framework.WebService.JSONModel.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationWebService {

    @Autowired
    private JobDAO jobDAO;

    @Async
    @RequestMapping("/toGenerateReport")
    public Report toGenerateReport(){
        try{
            return new Report(0,"Report generation started",jobDAO.insertNewJob(new Job()));
        }
        catch (Exception e){
            return new Report(100,"SYSTEM_ERROR");
        }
    };

    @RequestMapping("/toCheckTheStatusOfReportGeneration")
    public void toCheckTheStatusOfReportGeneration(){

    };

    @RequestMapping("/toCancelReportGeneration")
    public void toCancelReportGeneration(){

    };

    @RequestMapping("/toDownloadTheReport")
    public void toDownloadTheReport(){

    };
}
