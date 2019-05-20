package org.framework.JDBC.DAO;

import org.framework.JDBC.Model.Job;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDAO {
    public List<Job> findAll();
    public Job findJobById(Long id);
    public String getStatusById(Long id);
    public Long insertNewJob(Job job);
    public String updateStatusById(Long jobid);
    public void delete(Job job);
}
