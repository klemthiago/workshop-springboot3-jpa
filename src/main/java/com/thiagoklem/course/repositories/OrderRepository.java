package com.thiagoklem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoklem.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
