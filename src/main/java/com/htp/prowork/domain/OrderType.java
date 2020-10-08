package com.htp.prowork.domain;


import java.util.Objects;

public class OrderType {

  private Long id;
  private String name;

  public OrderType() {
  }

  public OrderType(Long id, String name) {
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
    OrderType orderType = (OrderType) o;
    return Objects.equals(id, orderType.id) &&
            Objects.equals(name, orderType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "OrderType{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
