package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色
 * Created by cuiP on 2017/2/8.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends BaseEntity{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//超级管理员标识
    public static final String ROLE_TYPE = "ROEL_ADMIN";

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色标识
     */
    private String perms;

    /**
     * 备注
     */
    private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerms() {
		return perms;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    
}
