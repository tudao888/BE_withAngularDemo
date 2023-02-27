package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService<E>{
//    List<Product> getAll();
//
//    Product save(Product product);
//
//    void delete(int id);
//
//    Product findById(int id);
    List<E> getAll();
    E save(E e);
    void delete(int id);
    E findById(int id);


}
