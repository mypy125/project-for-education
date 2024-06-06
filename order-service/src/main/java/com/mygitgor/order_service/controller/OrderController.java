package com.mygitgor.order_service.controller;

import com.mygitgor.order_service.dto.OrderRequest;
import com.mygitgor.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    public CompletableFuture<String> placeOrder(@RequestBody OrderRequest orderRequest){
        return null;
    }


}
