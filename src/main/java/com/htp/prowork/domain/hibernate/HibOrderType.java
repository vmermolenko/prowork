package com.htp.prowork.domain.hibernate;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prowork.order_type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HibOrderType {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  public HibOrderType() {
  }

  public HibOrderType(Long id, String name) {
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
    HibOrderType orderType = (HibOrderType) o;
    return Objects.equals(id, orderType.id) &&
            Objects.equals(name, orderType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "HibOrderType{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
