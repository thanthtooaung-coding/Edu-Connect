package org.vinn.teachToMe.tables.reactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.reactions.entity.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {

}
