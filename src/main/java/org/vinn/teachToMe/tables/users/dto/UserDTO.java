package org.vinn.teachToMe.tables.users.dto;

import java.time.Instant;
import java.util.Set;

import org.vinn.teachToMe.tables.comments.dto.CommentDTO;
import org.vinn.teachToMe.tables.posts.dto.PostDTO;
import org.vinn.teachToMe.tables.roles.dto.RoleDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private RoleDTO role;
    private Instant createdAt;
    private Instant updatedAt;

    private Set<PostDTO> posts;
    private Set<CommentDTO> comments;

}
