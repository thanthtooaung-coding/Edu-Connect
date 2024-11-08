package org.vinn.teachToMe.tables.roles.dto;

import java.util.Set;

import org.vinn.teachToMe.tables.permissions.dto.PermissionDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDTO {
    private Long id;
    private String name;
    private Set<PermissionDTO> permissions;

}
