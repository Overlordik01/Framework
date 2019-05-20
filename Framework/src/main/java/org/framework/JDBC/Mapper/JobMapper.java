package org.framework.JDBC.Mapper;

import org.framework.JDBC.Model.Job;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobMapper implements RowMapper<Job> {
    @Override
    public Job mapRow(ResultSet resultSet, int rowMap) throws SQLException{
        Job job = new Job();
        job.setJobid(resultSet.getLong("JOBID"));
        job.setType(resultSet.getString("TYPE"));
        job.setVersion(resultSet.getInt("VERSION"));
        job.setStatus(resultSet.getString("STATUS"));
        return job;
    }
}
