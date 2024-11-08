package org.vinn.teachToMe.tables.roles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.roles.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
