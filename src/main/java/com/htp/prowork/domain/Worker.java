package com.htp.prowork.domain;


import java.sql.Timestamp;
import java.util.Objects;

public class Worker {

  private Long id;
  private String name;
  private String mail;
  private String avatarUrl;
  private Timestamp age;
  private Long sex;
  private String phone;
  private String passport;
  private Timestamp dateFrom;
  private Timestamp dateTo;
  private Long orderCount;
  private Long status;
  private Long statusMail;
  private String hash;
  private String password;
  private String ip;
  private String phoneCodActivation;
  private String token;
  private String tokenWeb;
  private Long rang;

  public Worker() {
  }

  public Worker(Long id, String name, String mail, String avatarUrl, Timestamp age, Long sex, String phone, String passport, Timestamp dateFrom, Timestamp dateTo, Long orderCount, Long status, Long statusMail, String hash, String password, String ip, String phoneCodActivation, String token, String tokenWeb, Long rang) {
    this.id = id;
    this.name = name;
    this.mail = mail;
    this.avatarUrl = avatarUrl;
    this.age = age;
    this.sex = sex;
    this.phone = phone;
    this.passport = passport;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.orderCount = orderCount;
    this.status = status;
    this.statusMail = statusMail;
    this.hash = hash;
    this.password = password;
    this.ip = ip;
    this.phoneCodActivation = phoneCodActivation;
    this.token = token;
    this.tokenWeb = tokenWeb;
    this.rang = rang;
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

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Timestamp getAge() {
    return age;
  }

  public void setAge(Timestamp age) {
    this.age = age;
  }

  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
    this.sex = sex;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
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

  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
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

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getPhoneCodActivation() {
    return phoneCodActivation;
  }

  public void setPhoneCodActivation(String phoneCodActivation) {
    this.phoneCodActivation = phoneCodActivation;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getTokenWeb() {
    return tokenWeb;
  }

  public void setTokenWeb(String tokenWeb) {
    this.tokenWeb = tokenWeb;
  }

  public Long getRang() {
    return rang;
  }

  public void setRang(Long rang) {
    this.rang = rang;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Worker worker = (Worker) o;
    return Objects.equals(id, worker.id) &&
            Objects.equals(name, worker.name) &&
            Objects.equals(mail, worker.mail) &&
            Objects.equals(avatarUrl, worker.avatarUrl) &&
            Objects.equals(age, worker.age) &&
            Objects.equals(sex, worker.sex) &&
            Objects.equals(phone, worker.phone) &&
            Objects.equals(passport, worker.passport) &&
            Objects.equals(dateFrom, worker.dateFrom) &&
            Objects.equals(dateTo, worker.dateTo) &&
            Objects.equals(orderCount, worker.orderCount) &&
            Objects.equals(status, worker.status) &&
            Objects.equals(statusMail, worker.statusMail) &&
            Objects.equals(hash, worker.hash) &&
            Objects.equals(password, worker.password) &&
            Objects.equals(ip, worker.ip) &&
            Objects.equals(phoneCodActivation, worker.phoneCodActivation) &&
            Objects.equals(token, worker.token) &&
            Objects.equals(tokenWeb, worker.tokenWeb) &&
            Objects.equals(rang, worker.rang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mail, avatarUrl, age, sex, phone, passport, dateFrom, dateTo, orderCount, status, statusMail, hash, password, ip, phoneCodActivation, token, tokenWeb, rang);
  }

  @Override
  public String toString() {
    return "Worker{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", mail='" + mail + '\'' +
            ", avatarUrl='" + avatarUrl + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            ", phone='" + phone + '\'' +
            ", passport='" + passport + '\'' +
            ", dateFrom=" + dateFrom +
            ", dateTo=" + dateTo +
            ", orderCount=" + orderCount +
            ", status=" + status +
            ", statusMail=" + statusMail +
            ", hash='" + hash + '\'' +
            ", password='" + password + '\'' +
            ", ip='" + ip + '\'' +
            ", phoneCodActivation='" + phoneCodActivation + '\'' +
            ", token='" + token + '\'' +
            ", tokenWeb='" + tokenWeb + '\'' +
            ", rang=" + rang +
            '}';
  }
}
