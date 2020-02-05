package com.xxl.job.admin.core.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * xxl-job info
 *
 * @author xuxueli  2016-1-12 18:25:49
 */
@ApiModel("任务信息实体对象")
public class XxlJobInfo {
	
	private int id;				// 主键ID
	@ApiModelProperty("执行器主键ID")
	private int jobGroup; // 执行器主键ID
	@ApiModelProperty("任务执行CRON表达式")
	private String jobCron;		// 任务执行CRON表达式
	@ApiModelProperty("任务描述")
	private String jobDesc;
	
	private Date addTime;
	private Date updateTime;

	@ApiModelProperty("负责人")
	private String author;		// 负责人
	@ApiModelProperty("报警邮件")
	private String alarmEmail;	// 报警邮件

	@ApiModelProperty("执行器路由策略")
	private String executorRouteStrategy;	// 执行器路由策略
	@ApiModelProperty("执行器，任务Handler名称")
	private String executorHandler;		    // 执行器，任务Handler名称
	@ApiModelProperty("执行器，任务参数")
	private String executorParam;		    // 执行器，任务参数
	@ApiModelProperty("阻塞处理策略")
	private String executorBlockStrategy;	// 阻塞处理策略
	@ApiModelProperty("任务执行超时时间，单位秒")
	private int executorTimeout;     		// 任务执行超时时间，单位秒
	@ApiModelProperty("失败重试次数")
	private int executorFailRetryCount;		// 失败重试次数

	@ApiModelProperty("GLUE类型\t#com.xxl.job.core.glue.GlueTypeEnum")
	private String glueType;		// GLUE类型	#com.xxl.job.core.glue.GlueTypeEnum
	@ApiModelProperty("GLUE源代码")
	private String glueSource;		// GLUE源代码
	@ApiModelProperty("GLUE备注")
	private String glueRemark;		// GLUE备注
	@ApiModelProperty("GLUE更新时间")
	private Date glueUpdatetime;	// GLUE更新时间
	@ApiModelProperty("子任务ID，多个逗号分隔")
	private String childJobId;		// 子任务ID，多个逗号分隔
	@ApiModelProperty("调度状态：0-停止，1-运行")
	private int triggerStatus;		// 调度状态：0-停止，1-运行
	@ApiModelProperty("调度状态：0-停止，1-运行")
	private long triggerLastTime;	// 上次调度时间
	@ApiModelProperty("上次调度时间")
	private long triggerNextTime;	// 下次调度时间


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(int jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobCron() {
		return jobCron;
	}

	public void setJobCron(String jobCron) {
		this.jobCron = jobCron;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAlarmEmail() {
		return alarmEmail;
	}

	public void setAlarmEmail(String alarmEmail) {
		this.alarmEmail = alarmEmail;
	}

	public String getExecutorRouteStrategy() {
		return executorRouteStrategy;
	}

	public void setExecutorRouteStrategy(String executorRouteStrategy) {
		this.executorRouteStrategy = executorRouteStrategy;
	}

	public String getExecutorHandler() {
		return executorHandler;
	}

	public void setExecutorHandler(String executorHandler) {
		this.executorHandler = executorHandler;
	}

	public String getExecutorParam() {
		return executorParam;
	}

	public void setExecutorParam(String executorParam) {
		this.executorParam = executorParam;
	}

	public String getExecutorBlockStrategy() {
		return executorBlockStrategy;
	}

	public void setExecutorBlockStrategy(String executorBlockStrategy) {
		this.executorBlockStrategy = executorBlockStrategy;
	}

	public int getExecutorTimeout() {
		return executorTimeout;
	}

	public void setExecutorTimeout(int executorTimeout) {
		this.executorTimeout = executorTimeout;
	}

	public int getExecutorFailRetryCount() {
		return executorFailRetryCount;
	}

	public void setExecutorFailRetryCount(int executorFailRetryCount) {
		this.executorFailRetryCount = executorFailRetryCount;
	}

	public String getGlueType() {
		return glueType;
	}

	public void setGlueType(String glueType) {
		this.glueType = glueType;
	}

	public String getGlueSource() {
		return glueSource;
	}

	public void setGlueSource(String glueSource) {
		this.glueSource = glueSource;
	}

	public String getGlueRemark() {
		return glueRemark;
	}

	public void setGlueRemark(String glueRemark) {
		this.glueRemark = glueRemark;
	}

	public Date getGlueUpdatetime() {
		return glueUpdatetime;
	}

	public void setGlueUpdatetime(Date glueUpdatetime) {
		this.glueUpdatetime = glueUpdatetime;
	}

	public String getChildJobId() {
		return childJobId;
	}

	public void setChildJobId(String childJobId) {
		this.childJobId = childJobId;
	}

	public int getTriggerStatus() {
		return triggerStatus;
	}

	public void setTriggerStatus(int triggerStatus) {
		this.triggerStatus = triggerStatus;
	}

	public long getTriggerLastTime() {
		return triggerLastTime;
	}

	public void setTriggerLastTime(long triggerLastTime) {
		this.triggerLastTime = triggerLastTime;
	}

	public long getTriggerNextTime() {
		return triggerNextTime;
	}

	public void setTriggerNextTime(long triggerNextTime) {
		this.triggerNextTime = triggerNextTime;
	}
}
