package com.gx.config;

import lombok.Data;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月11日 09:45:00
 */

@Data
public class Function {
    private String sqltype;
    private String funcName;
    private String sql;
    private Object resultType;
    private String parameterType;
}
