package com.exam.demo.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.demo.order.entity.Order;
import com.exam.demo.order.mapper.OrderMapper;
import com.exam.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired OrderMapper orderMapper;

    @Override
    public Integer CreateOneOrder(Order aOrder) {
        aOrder.setCreateTime(LocalDateTime.now());
        if(baseMapper.CreateOneOrder(aOrder)){
            return aOrder.getId();
        }else{
            return 500;
        }
    }

    @Override
    public List<Order> getOrderLePrice(double aprice){
        QueryWrapper<Order> condition_price = new QueryWrapper<>();
        condition_price.lambda().le(Order::getSales, aprice);
        return baseMapper.getOrderLePrice(condition_price);
    }

    @Override
    public Integer modifyOneOrder(Integer id, Order aOrder) {
        Order temOrder = super.getById(id);
        if(aOrder.getAddress() != null){
            temOrder.setAddress(aOrder.getAddress());
        }
        if(aOrder.getSales() != null){
            temOrder.setSales(aOrder.getSales());
        }
        if(super.updateById(temOrder)){
            return id;
        }else {
            return 500;
        }
    }

    @Override
    public Integer deleteOneOrder(Integer id) {
        QueryWrapper<Order> condition_id = new QueryWrapper<>();
        condition_id.lambda().eq(Order::getId, id);
        if(1 == baseMapper.deleteOneOrder(condition_id)){
            return id;
        }else {
            return 500;
        }
    }
}
