package com.fan.configserver.exception;

import com.fan.configserver.vo.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/29 13:14
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/29 13:14
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(QhException.class)
    public ResponseResult qhExceptionHandler(QhException e) {
        ResponseResult responseResult = new ResponseResult(false);
        ErrorCode errorcode = e.getErrorcode();
        responseResult.setCode(errorcode.getCode());
        responseResult.setMsg(errorcode.getDesc());
        responseResult.setData(((QhException) e).getExtraInfo());
        return responseResult;
    }

}
