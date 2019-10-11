package com.gx.config;

import lombok.Data;

import java.util.List;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月11日 09:44:00
 */
@Data
public class MapperBean {
    private String interfaceName; //接口名
    private List<Function> list; //接口下所有方法
    //省略 get  set方法...
}
