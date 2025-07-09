//package com.order.tracker.order.tracker.service.service;
//
//import com.order.tracker.order.tracker.service.model.User;
//import com.order.tracker.order.tracker.service.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
//
//@SpringBootTest
//class UserServiceTest {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    void createUser_shouldSaveUser() {
//        User user = new User();
//        //user.setName("Test User");
//        user.setEmail("test@example.com");
//
//        User savedUser = userService.createUser(user);
//
//        assertNotNull(savedUser.getId());
//       // assertEquals("Test User", savedUser.getName());
//    }
//}
