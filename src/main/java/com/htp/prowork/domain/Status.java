package com.htp.prowork.domain;


import java.util.Objects;

public class Status {

  private Long id;
  private String name;
  private String nameclient;

  public Status() {
  }

  public Status(Long id, String name, String nameclient) {
    this.id = id;
    this.name = name;
    this.nameclient = nameclient;
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

  public String getNameclient() {
    return nameclient;
  }

  public void setNameclient(String nameclient) {
    this.nameclient = nameclient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Status status = (Status) o;
    return Objects.equals(id, status.id) &&
            Objects.equals(name, status.name) &&
            Objects.equals(nameclient, status.nameclient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameclient);
  }

  @Override
  public String toString() {
    return "Status{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", nameclient='" + nameclient + '\'' +
            '}';
  }
}
