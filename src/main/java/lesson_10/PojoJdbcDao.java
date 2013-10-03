package lesson_10;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PojoJdbcDao extends JdbcDaoSupport implements iPojo {

    @Override
    public void savePojo(Pojo pojo) {

        this.getJdbcTemplate().update("insert into client (name, phone, pc, salary) values (?, ?, ?, ?)",
                new Object[] {pojo.getClient(), pojo.getPhone(), pojo.getPc(), pojo.getSalary()});

    }
}
