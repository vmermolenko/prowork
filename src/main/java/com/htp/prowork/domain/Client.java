package com.htp.prowork.domain;


import java.sql.Timestamp;
import java.util.Objects;

public class Client {

  private Long id;
  private String name;
  private String phone;
  private String mail;
  private String password;
  private Long status;
  private Long statusMail;
  private Timestamp dateFrom;
  private Timestamp dateTo;
  private String hash;
  private String phoneCodActivation;

  public Client() {
  }

  public Client(Long id, String name, String phone, String mail, String password, Long status, Long statusMail, Timestamp dateFrom, Timestamp dateTo, String hash, String phoneCodActivation) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.mail = mail;
    this.password = password;
    this.status = status;
    this.statusMail = statusMail;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.hash = hash;
    this.phoneCodActivation = phoneCodActivation;
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

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Long getStatusMail() {
    return statusMail;
  }

  public void setStatusMail(Long statusMail) {
    this.statusMail = statusMail;
  }

  public Timestamp getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Timestamp dateFrom) {
    this.dateFrom = dateFrom;
  }

  public Timestamp getDateTo() {
    return dateTo;
  }

  public void setDateTo(Timestamp dateTo) {
    this.dateTo = dateTo;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getPhoneCodActivation() {
    return phoneCodActivation;
  }

  public void setPhoneCodActivation(String phoneCodActivation) {
    this.phoneCodActivation = phoneCodActivation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Client client = (Client) o;
    return Objects.equals(id, client.id) &&
            Objects.equals(name, client.name) &&
            Objects.equals(phone, client.phone) &&
            Objects.equals(mail, client.mail) &&
            Objects.equals(password, client.password) &&
            Objects.equals(status, client.status) &&
            Objects.equals(statusMail, client.statusMail) &&
            Objects.equals(dateFrom, client.dateFrom) &&
            Objects.equals(dateTo, client.dateTo) &&
            Objects.equals(hash, client.hash) &&
            Objects.equals(phoneCodActivation, client.phoneCodActivation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phone, mail, password, status, statusMail, dateFrom, dateTo, hash, phoneCodActivation);
  }

  @Override
  public String toString() {
    return "Client{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", mail='" + mail + '\'' +
            ", password='" + password + '\'' +
            ", status=" + status +
            ", statusMail=" + statusMail +
            ", dateFrom=" + dateFrom +
            ", dateTo=" + dateTo +
            ", hash='" + hash + '\'' +
            ", phoneCodActivation='" + phoneCodActivation + '\'' +
            '}';
  }
}
