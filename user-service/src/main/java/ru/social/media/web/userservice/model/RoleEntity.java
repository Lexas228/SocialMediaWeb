package ru.social.media.web.userservice.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleEntity extends DefaultEntity{

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    Roles role;

    @ManyToMany
    @JoinTable(name = "roles_privileges",
    joinColumns = @JoinColumn(name = "role_id"),
    inverseJoinColumns = @JoinColumn(name = "privilege_id"))
    Set<PrivilegeEntity> privilegeEntities;

}
