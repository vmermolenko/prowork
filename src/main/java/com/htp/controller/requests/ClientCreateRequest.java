package com.htp.controller.requests;

import java.sql.Timestamp;
import java.util.Objects;

public class ClientCreateRequest {

    private String name;
    private String phone;
    private String mail;
    private String password;

    public ClientCreateRequest() {
    }

    public ClientCreateRequest(String name, String phone, String mail, String password) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientCreateRequest that = (ClientCreateRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, mail, password);
    }

    @Override
    public String toString() {
        return "ClientCreateRequest{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
