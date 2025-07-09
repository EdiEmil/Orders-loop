package com.order.tracker.order.tracker.service.repository;

import com.order.tracker.order.tracker.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
