package ru.social.media.web.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PrivilegeEntity extends DefaultEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "privilege")
    Privileges privileges;

}
