package ua.edu.ucu.apps.FlowerStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.FlowerStore.model.AppUser;
import ua.edu.ucu.apps.FlowerStore.repository.AppUserRepository;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.appUserRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findByEmail(email);
    }
}
