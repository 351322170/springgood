package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色权限中间表
 * @author cuiP
 * Created by JK on 2017/2/13.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RolePermission extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long roleId;
    private Long permissionId;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
    
    
}
