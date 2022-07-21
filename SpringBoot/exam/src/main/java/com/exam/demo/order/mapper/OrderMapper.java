package com.exam.demo.order.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.exam.demo.order.entity.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
//    List<Order> getOrderByAddress(String aaddress);
    Integer CreateOneOrder(Order order);
    @Select("select * from orders ${ew.customSqlSegment}")
    @Results( @Result(column = "ORDER_ID",property = "id"))
    List<Order> getOrderLePrice(@Param(Constants.WRAPPER)QueryWrapper<Order> condition);
    @Delete("delete from orders ${ew.customSqlSegment}")
    Integer deleteOneOrder(@Param(Constants.WRAPPER)QueryWrapper<Order> condition);
}
