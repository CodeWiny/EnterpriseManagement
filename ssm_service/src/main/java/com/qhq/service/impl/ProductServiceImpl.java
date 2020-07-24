package com.qhq.service.impl;

import com.qhq.Product;
import com.qhq.dao.ProductDao;
import com.qhq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
