package com.htp.prowork.domain.hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class HibSex {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    public HibSex() {
    }

    public HibSex(Long id, String name) {
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
        HibSex sex = (HibSex) o;
        return Objects.equals(id, sex.id) &&
                Objects.equals(name, sex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "HibSex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
