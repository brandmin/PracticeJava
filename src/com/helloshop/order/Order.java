package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // 회원과 상품을 받아서 생성자 생성.
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
