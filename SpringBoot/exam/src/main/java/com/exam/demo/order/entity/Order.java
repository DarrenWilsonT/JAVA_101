package com.exam.demo.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName(value = "orders")
public class Order {
    @TableId(value = "ORDER_ID", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "ADDRESS")
    private String address ;

    @TableField(value = "SALES")
    private Double sales;

    @TableField(value = "CREATE_TIME")
    private LocalDateTime CreateTime;
}
