package cgi.be.controller;

import cgi.be.model.Users;
import cgi.be.repositry.UsersRepository;
import cgi.be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    //    @Autowired
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{email}")
    public Users getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping("/valid")
    public List<Users> getAllUsersByEmail() {
    return userService.getAllUsers();
    }

}
