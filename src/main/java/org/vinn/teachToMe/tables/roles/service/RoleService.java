package org.vinn.teachToMe.tables.roles.service;

import org.vinn.teachToMe.tables.roles.dto.RoleDTO;

public interface RoleService {
	RoleDTO getUserById(Long id);

	RoleDTO getUserByName(String name);

	RoleDTO createUser(RoleDTO userDto);

	RoleDTO updateUser(Long id, RoleDTO userDto);

    void deleteRole(Long id);

}
