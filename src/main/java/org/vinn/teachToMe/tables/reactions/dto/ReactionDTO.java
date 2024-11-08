package org.vinn.teachToMe.tables.reactions.dto;

import java.time.Instant;

import org.vinn.teachToMe.tables.posts.dto.PostDTO;
import org.vinn.teachToMe.tables.reactions.entity.ReactionType;
import org.vinn.teachToMe.tables.users.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReactionDTO {
    private Long id;
    private ReactionType reactionType;
    private UserDTO user;
    private PostDTO post;
    private Instant createdAt;

}
