package cn.service;

import cn.entity.Order;
import cn.entity.OrderItem;
import cn.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Integer addUser(User user);

    User getByPhone(String phone);

    Integer addOrder(Order order);

    Integer addOrderItem(OrderItem orderItem);

    Order getOrderByOrderId(Integer id);

    List<Order> getOIdsByRecordId(Integer recordId);

    List<OrderItem> getByOrderIds(List<Integer> oIds);

    Integer editOrderStatus(Order order);

    //根据姓名模糊查询
    List<User> getByName(String name);

}