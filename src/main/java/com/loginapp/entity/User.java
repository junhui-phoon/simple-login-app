package com.loginapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Data
@Setter
@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String userName;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String name;

    @Column(nullable = false, columnDefinition = "VARCHAR(64)")
    private String password;

    @Column(nullable = false)
    private boolean isEnabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public boolean hasRole(String roleName) {
        Iterator<Role> iter = this.roles.iterator();
        while (iter.hasNext()) {
            Role role = iter.next();
            if (role.getRoleName().equals(roleName)) {
                return true;
            }
        }
        return false;
    }

}
