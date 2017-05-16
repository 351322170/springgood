package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * 用户 Created by cuiP on 2017/1/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 加密密码的盐
	 */
	private String salt;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 手机号
	 */
	private String mobilePhone;
	/**
	 * 性别 true 男 false 女
	 */
	private Boolean sex;

	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 是否禁用 true禁用 false 启用
	 */
	private Boolean isLock;
	/**
	 * 是否删除 true 删除 false 未删除
	 */
	private Boolean isDel;

	/**
	 * 是否是超级管理员
	 */
	private Boolean isAdmin;
	/**
	 * 最近一次登录时间
	 */
	private Date loginTime;

	@Transient
	private String roleName;

	@Transient
	private List<Permission> menus;// 菜单

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Permission> getMenus() {
		return menus;
	}

	public void setMenus(List<Permission> menus) {
		this.menus = menus;
	}

	
}
