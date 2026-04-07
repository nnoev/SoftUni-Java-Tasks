package java_db._02_orm_fundamentals.lab.entities;

import java_db._02_orm_fundamentals.lab.orm.anotations.Column;
import java_db._02_orm_fundamentals.lab.orm.anotations.Entity;
import java_db._02_orm_fundamentals.lab.orm.anotations.Id;

import java.time.LocalDate;
@Entity(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "registration")
    private LocalDate registration;


    public User(){};
    public User(String username, String password, int age, LocalDate registration) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.registration = registration;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getRegistrationDate() {
        return registration;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registration = registrationDate;
    }
}
