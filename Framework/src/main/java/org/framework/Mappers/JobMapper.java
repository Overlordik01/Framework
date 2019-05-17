package org.framework.Mappers;

import org.framework.Model.JobModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobMapper implements RowMapper<JobModel> {
    @Override
    public JobModel mapRow(ResultSet resultSet, int rowMap) throws SQLException{
        JobModel jobModel = new JobModel();
        jobModel.setJobid(resultSet.getLong("JOBID"));
        jobModel.setType(resultSet.getString("TYPE"));
        jobModel.setVersion(resultSet.getInt("VERSION"));
        jobModel.setStatus(resultSet.getString("STATUS"));
        return jobModel;
    }
}
