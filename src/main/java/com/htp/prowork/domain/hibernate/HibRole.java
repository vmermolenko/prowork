package com.htp.prowork.domain.hibernate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "roles")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "roleId")
public class HibRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    @Size(max = 50, message = "{roleName.maximum.size}")
    private String roleName;

    @Column(name = "role_user_id")
    private Long roleUserId;

    /*
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_user_id")
    */

    public HibRole() {
    }

    public HibRole(@Size(max = 50, message = "{roleName.maximum.size}") String roleName, Long roleUserId) {
        this.roleName = roleName;
        this.roleUserId = roleUserId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(Long roleUserId) {
        this.roleUserId = roleUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HibRole hibRole = (HibRole) o;
        return Objects.equals(roleId, hibRole.roleId) &&
                Objects.equals(roleName, hibRole.roleName) &&
                Objects.equals(roleUserId, hibRole.roleUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleUserId);
    }

    @Override
    public String toString() {
        return "HibRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleUserId=" + roleUserId +
                '}';
    }
}
