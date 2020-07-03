package com.dzh.leyou.common.exception;

import com.dzh.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LyException extends RuntimeException{
    private ExceptionEnum exceptionEnum;
}
