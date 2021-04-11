package com.unilever.hefei.mes.common;

import com.unilever.hefei.mes.common.entity.Result;

public interface ErrorCode {
	default <T> Result<T> successResult(T data) {
		return new Result<T>(CODE_SUCCESS, null, data);
	}

	/** 操作成功 */
	static  final String CODE_SUCCESS = "MES-CONTROLLER-0000";

	/** 因操作权限不足，访问被拒绝 */
	static  final String CODE_FORBIDDEN = "MES-CONTROLLER-0003";

	/** 查询成功，但无数据 */
	static  final String CODE_SUCCESS_NULL = "MES-CONTROLLER-0005";

	/** 系统异常 */
	static  final String CODE_EXCEPTION_OCCURED = "MES-CONTROLLER-0006";

	// ------------------- custom errorcode -----------------------
	static  final String CODE_FAIL_BLOCK ="MES-GATEWAY-BLOCK-0004";
	// ------------------- configuration management -----------------------

}
