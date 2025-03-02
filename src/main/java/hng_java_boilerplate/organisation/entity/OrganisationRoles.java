package hng_java_boilerplate.organisation.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "org_roles")
@Data
public class OrganisationRoles {
    String id;
    String name;
    LocalDateTime created_at;
    LocalDateTime updated_at;
    String organisation_id;
}
