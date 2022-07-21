package com.exam.demo.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.demo.order.entity.Order;

import java.util.List;

public interface OrderService extends IService<Order> {
    Integer CreateOneOrder(Order aOrder);
    List<Order> getOrderLePrice(double aprice);
    Integer modifyOneOrder(Integer id, Order aOrder);
    Integer deleteOneOrder(Integer id);
}
