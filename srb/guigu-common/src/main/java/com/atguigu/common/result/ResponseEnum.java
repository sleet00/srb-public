package com.atguigu.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum  ResponseEnum {

    SUCCESS(0, "成功"),
    ERROR(-1, "服务器内部错误"),
    SERVLET_ERROR(-102, "servlet请求异常"),
    BORROW_AMOUNT_NULL_ERROR(-201, "借款额度不能为空"),
    BAD_SQL_GRAMMAR_ERROR(-101,"sql语法错误");

    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;
}
