package org.framework.DAO.InterfaceDAO;


import org.framework.Mappers.JobMapper;
import org.framework.Model.JobModel;

import java.util.List;

public interface JobDAO {
    public List<JobModel> findAll();

    public JobModel findUserById(int jobid);

    public JobModel create(final JobModel jobModel);
}
