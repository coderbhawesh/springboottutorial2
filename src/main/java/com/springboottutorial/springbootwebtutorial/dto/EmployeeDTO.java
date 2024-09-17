package com.springboottutorial.springbootwebtutorial.dto;

import java.time.LocalDate;

public class EmployeeDTO {

   private Long id;
   private String name;
   private String email;
   private  int age;
   private LocalDate dateOfJoining;
   private Boolean active;

   public EmployeeDTO(){




   }

    public EmployeeDTO(Long id, String name, String email, int age, LocalDate dateOfJoining, Boolean on) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.active = on;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getOn() {
        return active;
    }

    public void setOn(Boolean isActive) {
        active = isActive;
    }
}
