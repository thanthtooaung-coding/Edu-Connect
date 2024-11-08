package org.vinn.teachToMe.tables.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vinn.teachToMe.tables.posts.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
