package org.vinn.teachToMe.tables.reactions.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

import org.vinn.teachToMe.tables.posts.entity.Post;
import org.vinn.teachToMe.tables.users.entity.User;

@Entity
@Table(name = "reactions")
@Getter
@Setter
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reactionTypes_id")
    private ReactionType reactionType;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

}
