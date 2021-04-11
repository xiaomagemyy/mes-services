package com.unilever.hefei.mes.common;

import com.unilever.hefei.mes.common.entity.Result;

public class ResultUtils {

	public static <T> Result<T> getNullResult(ResultVo resultVo){
		return new Result<>(resultVo.getErrorCode(), resultVo.getErrorMsg(), null);
	}
	
	public static <T> Result<T> getSuccessResult(T object) {
		return new Result<>(ResultVo.SUCCESS.getErrorCode(), ResultVo.SUCCESS.getErrorMsg(), object);
	}
}
