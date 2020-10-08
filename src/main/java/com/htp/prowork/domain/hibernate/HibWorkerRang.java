package com.htp.prowork.domain.hibernate;


import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class HibWorkerRang {

  @Id
  private Long id;
  @Column(name = "name")
  private String name;

  public HibWorkerRang() {
  }

  public HibWorkerRang(Long id, String name) {
    this.id = id;
    this.name = name;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HibWorkerRang that = (HibWorkerRang) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "HibWorkerRang{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
