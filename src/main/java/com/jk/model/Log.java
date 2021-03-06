package com.jk.model;

import com.xiaoleilu.hutool.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

/**
 * 系统日志
 * author : cuiP
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Log extends BaseEntity{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 应用名称
     */
    private String appName;
    /**
     * 日志类型 0操作日志，1异常日志
     */
    private Integer logType;
    /**
     * 操作人
     */
    private String username;
    /**
     * 用户操作
     */
    private String operation;
    /**
     * 请求方法名称(全路径)
     */
    private String methodName;
    /**
     * 请求方式(GET,POST,DELETE,PUT)
     */
    private String requestMethod;
    /**
     * 请求参数
     */
    private String requestParams;
    /**
     * 访问者ip
     */
    private String requestIp;
    /**
     * 请求uri
     */
    private String requestUri;
    /**
     * 异常编码
     */
    private String exceptionCode;
    /**
     * 异常详情
     */
    private String exceptionDetail;
    /**
     * 耗时(单位：毫秒)
     */
    private Long timeConsuming;
    /**
     * 客户端信息
     */
    private String userAgent;
    
    

    public String getAppName() {
		return appName;
	}



	public void setAppName(String appName) {
		this.appName = appName;
	}



	public Integer getLogType() {
		return logType;
	}



	public void setLogType(Integer logType) {
		this.logType = logType;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getOperation() {
		return operation;
	}



	public void setOperation(String operation) {
		this.operation = operation;
	}



	public String getMethodName() {
		return methodName;
	}



	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}



	public String getRequestMethod() {
		return requestMethod;
	}



	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}



	public String getRequestParams() {
		return requestParams;
	}



	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}



	public String getRequestIp() {
		return requestIp;
	}



	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}



	public String getRequestUri() {
		return requestUri;
	}



	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}



	public String getExceptionCode() {
		return exceptionCode;
	}



	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}



	public String getExceptionDetail() {
		return exceptionDetail;
	}



	public void setExceptionDetail(String exceptionDetail) {
		this.exceptionDetail = exceptionDetail;
	}



	public Long getTimeConsuming() {
		return timeConsuming;
	}



	public void setTimeConsuming(Long timeConsuming) {
		this.timeConsuming = timeConsuming;
	}



	public String getUserAgent() {
		return userAgent;
	}



	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}



	public void setParams(Map<String, String[]> paramMap) {
        if (paramMap == null) {
            return;
        }
        StringBuilder params = new StringBuilder();
        for (Map.Entry<String, String[]> param : paramMap.entrySet()) {
            params.append("".equals(params.toString()) ? "" : "&").append(param.getKey()).append("=");
            String paramValue = (param.getValue() != null
                    && param.getValue().length > 0 ? param.getValue()[0] : "");
            params.append(StrUtil.subPre(StrUtil.endWithIgnoreCase(
                    param.getKey(), "password") ? "" : paramValue, 100));
        }
        this.requestParams = params.toString();
    }
}