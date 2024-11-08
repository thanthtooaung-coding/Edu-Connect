package org.vinn.teachToMe.tables.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.comments.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
