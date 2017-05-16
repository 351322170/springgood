package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户角色中间表
 * @author cuiP
 * Created by JK on 2017/2/13.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRole extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userId;
    private Long roleId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
    
    
}
