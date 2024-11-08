package org.vinn.teachToMe.tables.posts.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

import org.vinn.teachToMe.tables.comments.entity.Comment;
import org.vinn.teachToMe.tables.reactions.entity.Reaction;
import org.vinn.teachToMe.tables.users.entity.User;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String caption;

    @Column(length = 45)
    private String description;

    @Column(name = "image_link", length = 45)
    private String imageLink;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reaction> reactions;

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

    @Column(name = "updated_at")
    private Instant updatedAt;

    @PreUpdate
    public void setLastUpdate() {
        this.updatedAt = Instant.now();
    }

}
