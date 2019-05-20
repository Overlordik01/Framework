package org.framework.WebService.JSONModel;

public class Report {

    private long code;
    private String message;
    private long jobid;

    public Report(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Report(long code, String message, long jobid) {
        this.code = code;
        this.message = message;
        this.jobid = jobid;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public long getJobid() {
        return jobid;
    }
}
