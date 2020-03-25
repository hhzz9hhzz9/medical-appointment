package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author llf
 * @date 2020/3/24 23:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
