package org.framework.JDBC.DAO.Repositories;

import org.framework.JDBC.DAO.JobDAO;
import org.framework.JDBC.Mapper.JobMapper;
import org.framework.JDBC.Model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class JobDAOImpl implements JobDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String sql;


    public List<Job> findAll() {
        sql = "SELECT * FROM job";
        return jdbcTemplate.query(sql,new JobMapper());
    }

    public Job findJobById(Long jobid){
        sql = "SELECT * FROM job WHERE jobid=?";
        Job job = jdbcTemplate.queryForObject(sql,new Object[]{jobid},new JobMapper());
        return job;
    };

    public String getStatusById(Long jobid) {
        sql = "SELECT status FROM job WHERE jobid=?";
        String status = this.jdbcTemplate.queryForObject(sql,new Object[]{jobid},String.class);
        return status;
    }

    public Long insertNewJob(Job job) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        sql = "INSERT INTO job (type,version,status)VALUES(?,?,?)";
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"jobid"});
            ps.setString(1, job.getType());
            ps.setInt(2, job.getVersion());
            ps.setString(3,job.getStatus());
            return ps;
        }, keyHolder);
        return (Long)keyHolder.getKey();
    }

    public String updateStatusById(Long jobid,String status) {
        sql = "UPDATE job SET status=? WHERE jobid=?";
        jdbcTemplate.update(sql,new Object[]{status,jobid},new JobMapper());
        return status;
    }

    public void delete(Job job) {

    }
}
