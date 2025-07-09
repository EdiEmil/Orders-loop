package com.order.tracker.order.tracker.service.repository;

import com.order.tracker.order.tracker.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long customerId);
    Optional<Order> findById(Long id);
    void deleteById(Long id);
}
