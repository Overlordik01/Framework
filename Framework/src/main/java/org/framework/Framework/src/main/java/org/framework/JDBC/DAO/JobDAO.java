package org.framework.JDBC.DAO;

import org.framework.JDBC.Model.Job;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDAO {
    public List<Job> findAll();
    public Boolean findJobById(Long jobid);
    public String getStatusById(Long jobid);
    public Long insertNewJob(Job job);
    public String updateStatusById(Long jobid,String status);
    public void delete(Job job);
}
