package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 任务调度执行日志
 * @author cuiP
 * Created by JK on 2017/5/4.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ScheduleJobLog extends BaseEntity{

    /**
     * 任务ID
     */
    private Long jobId;

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
     * 任务执行时调用哪个类的方法 包名+类名
     */
    private String beanClass;

    /**
     * 任务调用的方法名
     */
    private String methodName;

    /**
     * 参数
     */
    private String params;

    /**
     * 是否异步  0否 1是
     */
    private Boolean isSync;

    /**
     * 任务状态 0失败 1成功
     */
    private String status;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 失败信息
     */
    private String error;

    /**
     * 耗时(单位：毫秒)
     */
    private Long times;

    /**
     * 任务创建者
     */
    private Long jobCreateBy;

    /**
     * 任务创建时间
     */
    private Date jobCreateTime;
}
