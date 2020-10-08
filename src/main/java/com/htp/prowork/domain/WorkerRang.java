package com.htp.prowork.domain;


import java.util.Objects;

public class WorkerRang {

  private Long id;
  private String name;

  public WorkerRang() {
  }

  public WorkerRang(Long id, String name) {
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
    WorkerRang that = (WorkerRang) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "WorkerRang{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
