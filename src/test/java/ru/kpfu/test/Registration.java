package ru.kpfu.test;

/**
 * Created by Vladislav Ulyanov on 04.04.18.
 * vk.com/etovladislav
 */
public class Registration {
    private String email;
    private String name;
    private String password;

    public Registration(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
