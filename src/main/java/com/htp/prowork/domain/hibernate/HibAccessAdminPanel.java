package com.htp.prowork.domain.hibernate;


import java.sql.Timestamp;
import java.util.Objects;

public class HibAccessAdminPanel {

  private Long id;
  private String name;
  private String phone;
  private String email;
  private Timestamp dateFrom;
  private Timestamp dateTo;
  private String password;

  public HibAccessAdminPanel() {
  }

  public HibAccessAdminPanel(Long id, String name, String phone, String email, Timestamp dateFrom, Timestamp dateTo, String password) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.password = password;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
    HibAccessAdminPanel that = (HibAccessAdminPanel) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(phone, that.phone) &&
            Objects.equals(email, that.email) &&
            Objects.equals(dateFrom, that.dateFrom) &&
            Objects.equals(dateTo, that.dateTo) &&
            Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phone, email, dateFrom, dateTo, password);
  }

  @Override
  public String toString() {
    return "HibAccessAdminPanel{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", dateFrom=" + dateFrom +
            ", dateTo=" + dateTo +
            ", password='" + password + '\'' +
            '}';
  }
}
