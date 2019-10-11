package com.gx.sqlSession;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月11日 09:45:00
 */
public interface  Excutor {
    public <T> T query(String statement,Object parameter);
}
