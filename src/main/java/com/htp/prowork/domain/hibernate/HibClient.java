package com.htp.prowork.domain.hibernate;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "prowork.client")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HibClient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "phone")
  private String phone;

  @Column(name = "mail")
  private String mail;

  @Column(name = "password")
  private String password;

  @Column(name = "status")
  private Long status;

  @Column(name = "status_mail")
  private Long statusMail;

  @Column(name = "date_from")
  private Timestamp dateFrom;

  @Column(name = "date_to")
  private Timestamp dateTo;

  @Column(name = "hash")
  private String hash;

  @Column(name = "phone_cod_activation")
  private String phoneCodActivation;


  @JsonBackReference
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "hibClient")
  private Set<HibOrder> hibOrders = Collections.emptySet();

/*
  @JsonIgnore
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "hibClient")

  */

  public HibClient() {
  }

  public HibClient(String name, String phone, String mail, String password, Long status, Long statusMail, Timestamp dateFrom, Timestamp dateTo, String hash, String phoneCodActivation, Set<HibOrder> hibOrders) {
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
    this.hibOrders = hibOrders;
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

  public Set<HibOrder> getHibOrders() {
    return hibOrders;
  }

  public void setHibOrders(Set<HibOrder> hibOrders) {
    this.hibOrders = hibOrders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HibClient hibClient = (HibClient) o;
    return Objects.equals(id, hibClient.id) &&
            Objects.equals(name, hibClient.name) &&
            Objects.equals(phone, hibClient.phone) &&
            Objects.equals(mail, hibClient.mail) &&
            Objects.equals(password, hibClient.password) &&
            Objects.equals(status, hibClient.status) &&
            Objects.equals(statusMail, hibClient.statusMail) &&
            Objects.equals(dateFrom, hibClient.dateFrom) &&
            Objects.equals(dateTo, hibClient.dateTo) &&
            Objects.equals(hash, hibClient.hash) &&
            Objects.equals(phoneCodActivation, hibClient.phoneCodActivation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phone, mail, password, status, statusMail, dateFrom, dateTo, hash, phoneCodActivation);
  }

  @Override
  public String toString() {
    return "HibClient{" +
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
            ", hibOrders=" + hibOrders +
            '}';
  }
}
