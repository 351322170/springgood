package com.jk.task;

import com.jk.model.ScheduleJob;
import com.jk.util.ScheduleUtils;
import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 异步任务工厂(计划任务执行处 无状态)
 * @author cuiP
 */
@Slf4j
public class AsyncJobFactory extends QuartzJobBean {
	protected final transient Log log = LogFactory.get(this.getClass());

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		log.info("AsyncJobFactory execute");
		ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get(ScheduleJob.JOB_PARAM_KEY);
		ScheduleUtils.invokMethod(scheduleJob);
		log.info("jobName: {} " + scheduleJob);
	}
}