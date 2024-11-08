package org.vinn.teachToMe.tables.permissions.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import org.vinn.teachToMe.tables.roles.entity.Role;

@Entity
@Table(name = "permissions")
@Getter
@Setter
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 45)
    private String name;

    @Column(length = 100)
    private String description;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles;

}
