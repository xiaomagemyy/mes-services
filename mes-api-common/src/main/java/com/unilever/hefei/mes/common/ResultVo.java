package com.unilever.hefei.mes.common;

public enum ResultVo {

	SUCCESS_NULL(ErrorCode.CODE_SUCCESS_NULL, "查询成功，但无数据 "),
	SUCCESS(ErrorCode.CODE_SUCCESS, "")
	;
	
	private ResultVo(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	private String errorCode;
	
	private String errorMsg;

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
}
