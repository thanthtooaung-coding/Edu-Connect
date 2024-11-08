package org.vinn.teachToMe.tables.posts.dto;

import java.time.Instant;
import java.util.Set;

import org.vinn.teachToMe.tables.comments.dto.CommentDTO;
import org.vinn.teachToMe.tables.reactions.dto.ReactionDTO;
import org.vinn.teachToMe.tables.users.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDTO {
    private Long id;
    private String caption;
    private String description;
    private String imageLink;
    private UserDTO user;
    private Instant createdAt;
    private Instant updatedAt;
    private Set<CommentDTO> comments;
    private Set<ReactionDTO> reactions;

}
