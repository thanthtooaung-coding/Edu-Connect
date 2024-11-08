package org.vinn.teachToMe.tables.comments.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

import org.vinn.teachToMe.tables.posts.entity.Post;

@Entity
@Table(name = "comments")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String description;

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_edited", columnDefinition = "TINYINT(1)")
    private boolean isEdited;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;

    @PreUpdate
    public void setLastUpdate() {
        this.updatedAt = Instant.now();
    }

}
