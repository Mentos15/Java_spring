package by.ermakovich.search_command.controller;

import by.ermakovich.search_command.entity.Users;
import by.ermakovich.search_command.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuttAndRegController {

    @Autowired
    private UsersService usersService;

    @PostMapping(value = "/registrtarion")
    public String Register(Users user){
        if(!usersService.create(user)){
            return "BAD";
        }
        else{
            return "OK";
        }
    }

    @PostMapping(value = "/auth")
    public ResponseEntity Auth(Users user){
        if(usersService.findByLoginAndPassword(user.getUsername(), user.getPassword()) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("oshibka");
        }
        else{
            return ResponseEntity.ok("tokeennn");
        }

    }



}
