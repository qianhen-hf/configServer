package com.fan.configserver.exception;


/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/29 13:18
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/29 13:18
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

public class QhException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ErrorCode errorcode;

	private String extraInfo;

	private static String format = "errorcode:%d,typeid:%d,appid:%d,code:%d,errormsg:%s \n extrainfo:%s";

	private static String traceFormat = "errorcode:%d,typeid:%d,appid:%d,code:%d,errormsg:%s \n extrainfo:%s \n%s";

	public QhException(ErrorCode errorcode) {
		this.errorcode = errorcode;
	}

	public QhException(ErrorCode errorcode, String extraInfo) {
		super(formatMsg(errorcode, extraInfo));
		this.errorcode = errorcode;
		this.extraInfo = extraInfo;
	}

	public QhException(ErrorCode errorcode, String extraInfo, String traceformat) {
		super(formatMsg(errorcode, extraInfo, traceformat));
		this.errorcode = errorcode;
		this.extraInfo = extraInfo;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public ErrorCode getErrorcode() {
		return errorcode;
	}

	private static String formatMsg(ErrorCode errorcode, String extraInfo) {

		return String.format(format, errorcode.getErrorCode(), errorcode.getTypeId(), errorcode.getAppId(), errorcode.getCode(), errorcode.getDesc(), extraInfo);
	}

	private static String formatMsg(ErrorCode errorcode, String extraInfo, String trace) {

		return String.format(traceFormat, errorcode.getErrorCode(), errorcode.getTypeId(), errorcode.getAppId(), errorcode.getCode(), errorcode.getDesc(), extraInfo, trace);
	}

}
