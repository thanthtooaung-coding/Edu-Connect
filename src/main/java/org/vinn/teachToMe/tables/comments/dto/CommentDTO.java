package org.vinn.teachToMe.tables.comments.dto;

import java.time.Instant;

import org.vinn.teachToMe.tables.posts.dto.PostDTO;
import org.vinn.teachToMe.tables.users.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
    private Long id;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private boolean isEdited;
    private PostDTO post;
    private UserDTO user;

}
