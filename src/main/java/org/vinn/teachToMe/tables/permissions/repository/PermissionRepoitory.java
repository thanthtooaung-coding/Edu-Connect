package org.vinn.teachToMe.tables.permissions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.permissions.entity.Permission;

public interface PermissionRepoitory extends JpaRepository<Permission, Long> {

}
