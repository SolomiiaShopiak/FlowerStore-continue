package ua.edu.ucu.apps.FlowerStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.FlowerStore.model.AppUser;
import ua.edu.ucu.apps.FlowerStore.service.AppUserService;

@RestController
@RequestMapping("/api")
public class AppUserController {
    private AppUserService userService;

    @Autowired
    public AppUserController (AppUserService userService) {
        this.userService = userService;
    }
    @GetMapping("/appusers")
    public List<AppUser> getAppUsers() {
        return userService.getUsers();
    }

    @PostMapping("/appusers")
    public AppUser postAppUserService(@RequestBody AppUser user){
        return userService.createUser(user);
    }

    @GetMapping("/appusers/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = userService.getUserByEmail(email);

        if (userByEmail != null) {
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
    
}
