package hng_java_boilerplate.organisation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_org_roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOrganisationRole {
    String user_id;
    String organisation_id;
    String org_role_id;
}
