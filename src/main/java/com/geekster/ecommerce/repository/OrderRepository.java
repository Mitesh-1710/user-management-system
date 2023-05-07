package com.geekster.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.ecommerce.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
