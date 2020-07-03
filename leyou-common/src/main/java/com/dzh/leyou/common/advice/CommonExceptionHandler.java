package com.dzh.leyou.common.advice;


import com.dzh.leyou.common.enums.ExceptionEnum;
import com.dzh.leyou.common.exception.LyException;
import com.dzh.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> HandlerException(LyException le){
        ExceptionEnum em = le.getExceptionEnum();
        return ResponseEntity.status(le.getExceptionEnum().getCode()).body(new ExceptionResult(le.getExceptionEnum()));
    }
}
