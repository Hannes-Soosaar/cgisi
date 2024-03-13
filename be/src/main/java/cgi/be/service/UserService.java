package cgi.be.service;

import cgi.be.model.Users;
import cgi.be.repositry.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// handles the business logic.0
@Service
public class UserService {
    private final UsersRepository usersRepository;
    @Autowired
    public UserService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    public Users getUserByEmail(String email){
        return usersRepository.getUserByEmail(email);
    }

    public List<Users> getAllUsers() {
        return usersRepository.getAllUsers();
    }
}
