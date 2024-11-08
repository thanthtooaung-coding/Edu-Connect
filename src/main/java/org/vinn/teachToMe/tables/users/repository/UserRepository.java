package org.vinn.teachToMe.tables.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.users.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
