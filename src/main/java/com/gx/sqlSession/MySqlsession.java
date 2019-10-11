package com.gx.sqlSession;

import java.lang.reflect.Proxy;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月11日 09:45:00
 */
public class MySqlsession {
    private Excutor excutor= new MyExcutor();

    private MyConfiguration myConfiguration = new MyConfiguration();

    public <T> T selectOne(String statement,Object parameter){
        return excutor.query(statement, parameter);
    }

    @SuppressWarnings("unchecked")
    public <T> T getMapper(Class<T> clas){
        //动态代理调用
        return (T) Proxy.newProxyInstance(clas.getClassLoader(),new Class[]{clas},
                new MyMapperProxy(myConfiguration,this));
    }
}
