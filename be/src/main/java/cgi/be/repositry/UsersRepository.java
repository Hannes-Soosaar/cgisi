package cgi.be.repositry;

import cgi.be.model.Users;
import cgi.be.repositry.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// create save the query to a model/Entity
@Repository
public class UsersRepository {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UsersRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Users getUserByEmail(String email){
        String sql = "SELECT * FROM users WHERE email = ?";
        List<Users> users = jdbcTemplate.query(sql,new Object[]{email}, new UsersMapper());
        return users.isEmpty() ? null: users.get(0);
    }

}