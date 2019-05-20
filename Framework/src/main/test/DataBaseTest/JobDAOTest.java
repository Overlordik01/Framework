package DataBaseTest;

import org.framework.Application;
import org.framework.JDBC.DAO.JobDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class JobDAOTest {

    @Autowired
    JobDAO jobDAO;

    @Test
    public void testInsertJob_thenCorrect() {

    }
}
