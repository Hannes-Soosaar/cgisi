package cgi.be.controller;

import cgi.be.model.Users;
import cgi.be.repositry.UsersRepository;
import cgi.be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Interacts with FE server

@RestController
@RequestMapping("/users")
public class UserController {
//    @Autowired
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
      @GetMapping("/{email}")
      public Users getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

}
