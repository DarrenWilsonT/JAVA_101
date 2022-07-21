package com.exam.demo.order.controller;

import com.exam.demo.order.entity.Order;
import com.exam.demo.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("")
    public Integer CreateOneOrder(@RequestBody Order aNewOrder){
        return orderService.CreateOneOrder(aNewOrder);
    }

    @GetMapping("/{id}")
    public Order getOneOrder(@PathVariable(name = "id") Integer id){
        return orderService.getById(id);
    }

    @PutMapping("/{id}")
    public Integer modifyOneOrder(@PathVariable(name = "id") Integer id, @RequestBody Order aOrder){
        return orderService.modifyOneOrder(id, aOrder);
    }

    @DeleteMapping("/{id}")
    public Integer deleteOneOrder(@PathVariable(name = "id") Integer id){
        return orderService.deleteOneOrder(id);
    }

    @GetMapping("/price/{oprice}")
    public List<Order> getOrdersLePrice(@PathVariable(name = "oprice") Double aprice){
        return orderService.getOrderLePrice(aprice);
    }
}
