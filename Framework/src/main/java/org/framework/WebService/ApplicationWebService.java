package org.framework.WebService;

import org.framework.WebService.JSONModel.Report;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationWebService {

    @RequestMapping("/toGenerateReport")
    public Report toGenerateReport(){
        return new Report(1,"message",1);
    };
}
