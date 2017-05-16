package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 任务调度
 * 
 * @author cuiP
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ScheduleJob extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String STATUS_RUNNING = "1";
	public static final String STATUS_NOT_RUNNING = "0";

	/** 任务调度的参数key */
	public static final String JOB_PARAM_KEY    = "jobParam";

	/**
	 * 任务名称
     */
	private String jobName;

	/**
	 * 任务分组
     */
	private String jobGroup;

	/**
	 *  cron表达式
     */
	private String cron;

	/**
	 * 执行类名称 包名+类名
     */
	private String beanClass;

	/**
	 * 执行方法名称
	 */
	private String methodName;

	/**
	 * 触发器
     */
	private String jobTrigger;

	/**
	 * 参数
	 */
	private String params;

	/**
	 * 是否异步  0否 1是
     */
	private Boolean isSync;

	/**
	 * 任务状态 0禁用 1启用
     */
	private String status;

	/**
	 * 描述
     */
	private String remarks;

	/**
	 * 创建者
     */
	private Long createBy;

	/**
	 * 修改者
     */
	private Long modifyBy;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public String getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getJobTrigger() {
		return jobTrigger;
	}

	public void setJobTrigger(String jobTrigger) {
		this.jobTrigger = jobTrigger;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Boolean getIsSync() {
		return isSync;
	}

	public void setIsSync(Boolean isSync) {
		this.isSync = isSync;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Long getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	
}
