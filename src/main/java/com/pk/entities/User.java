package com.pk.entities;


import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    // while using hibernate we must add a unique entity
    // @Id annotation for primary key
    @Id
    // generates values for ID automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column annotation for all columns
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String gender;
    @Column
    private String city;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
