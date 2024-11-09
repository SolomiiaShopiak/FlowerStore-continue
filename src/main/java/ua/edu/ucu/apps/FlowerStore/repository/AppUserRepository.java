package ua.edu.ucu.apps.FlowerStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ua.edu.ucu.apps.FlowerStore.model.AppUser;


@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

    @Query("SELECT u FROM appusers u WHERE u.email = ?1")
    Optional<AppUser>findUserByEmail(String email);

    AppUser findByEmail(String email);
}

