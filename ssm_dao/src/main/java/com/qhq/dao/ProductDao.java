package com.qhq.dao;

import com.qhq.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * product持久化接口
 */

public interface ProductDao {
    /**
     * 查询所有方法
     * @return
     */
    @Select("select * from product")
   public List<Product> findAll();
}
