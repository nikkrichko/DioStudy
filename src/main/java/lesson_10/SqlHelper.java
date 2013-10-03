package lesson_10;


import com.jpattern.orm.jdbctemplate.JdbcTemplateExceptionTranslator;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SqlHelper  {
    private Pojo pojo;
    JdbcTemplate jdbcTemplate;

    public void setPojo(Pojo pojo){
        this.pojo = pojo;
    }
    public void insert(Pojo pojo){
        String sql = "INSERT INTO CLIENT " +
                "(name, phone, pc, salary) VALUES (?, ?, ?, ?)";
        jdbcTemplate = new JdbcTemplate();
    }


}
