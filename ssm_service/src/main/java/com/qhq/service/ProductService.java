package com.qhq.service;

import com.qhq.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 业务层持久化接口
 */
public interface ProductService {
    /**
     * 查询所有
     * @return
     */
    List<Product> findAll() throws Exception;
}
