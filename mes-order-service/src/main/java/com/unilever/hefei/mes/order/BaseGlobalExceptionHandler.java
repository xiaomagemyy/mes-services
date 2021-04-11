package com.unilever.hefei.mes.order;

import com.unilever.hefei.mes.common.ErrorCode;
import com.unilever.hefei.mes.common.entity.Result;
import com.unilever.hefei.mes.common.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseGlobalExceptionHandler {

    /**
     * 异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(ErrorCode.CODE_EXCEPTION_OCCURED,e.getMessage(),null);
    }
}
