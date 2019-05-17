package org.framework.DAO;

import org.framework.DAO.InterfaceDAO.JobDAO;
import org.framework.Mappers.JobMapper;
import org.framework.Model.JobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobDAOImpl implements JobDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<JobModel> findAll(){
        return jdbcTemplate.query("select * from job",
                new JobMapper());
    }

    public JobModel findUserById(int jobid){
        return jdbcTemplate.queryForObject(
                "select * from users where id=?",
                new Object[]{jobid}, new JobMapper());
    }

    public JobModel create(final JobModel jobModel){
        final String sql = "insert into users(name,email) values(?,?)";
        return jobModel;
    }
}
