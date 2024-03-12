package cgi.be.repositry.mapper;

import cgi.be.model.Users;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Users users = new Users();
        users.setId(resultSet.getLong("id"));
        users.setUserName(resultSet.getString("username"));
        users.setEmail(resultSet.getString("email"));
        users.setCredentials(resultSet.getString("credential"));
        users.setAdmin(resultSet.getBoolean("admin"));
        users.setActive(resultSet.getBoolean("active"));
        return users;
    }
}
