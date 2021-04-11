package com.unilever.hefei.mes.order;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.unilever.hefei.mes.common.entity.Result;

/**
 * @ClassName GlobalBlockHandler
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/3/24 21:42
 * @Version 1.0
 **/
public class GlobalBlockHandler {
        public static Result handlerException1(BlockException e){
            return new Result("111","HandlerException");
        }
        public static Result handlerException2(BlockException e){
            return new Result("444","handlerException2的fallback");
        }
}
