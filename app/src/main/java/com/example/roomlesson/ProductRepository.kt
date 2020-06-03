package com.example.roomlesson

class ProductRepository(private val productDao: ProductDao) {
    val allProducts: List<Product> = productDao.getAllProducts()
}