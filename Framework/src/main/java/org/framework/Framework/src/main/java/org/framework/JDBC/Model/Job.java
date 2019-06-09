package org.framework.JDBC.Model;

public class Job {

    private long jobid;
    private String type;
    private int version;
    private String status;

    public Job() {

    }

    public Job(String type, int version, String status){
        this.type = type;
        this.version = version;
        this.status = status;
    }
    public Job(long jobid, String type, int version, String status) {
        this.jobid = jobid;
        this.type = type;
        this.version = version;
        this.status = status;
    }

    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobid=" + jobid +
                ", type='" + type + '\'' +
                ", version=" + version +
                ", status='" + status + '\'' +
                '}';
    }
}
