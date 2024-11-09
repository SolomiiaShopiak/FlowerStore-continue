package ua.edu.ucu.apps.FlowerStore.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Table
@EntityScan
@Entity(name = "appusers")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique = true)
    private String email;

    private LocalDate dob;

    @Transient
    private Integer age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
