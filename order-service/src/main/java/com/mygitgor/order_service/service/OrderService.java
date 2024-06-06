package com.mygitgor.order_service.service;

import com.mygitgor.order_service.dto.OrderItemsDto;
import com.mygitgor.order_service.dto.OrderRequest;
import com.mygitgor.order_service.model.Order;
import com.mygitgor.order_service.model.OrderItem;
import com.mygitgor.order_service.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.UUID;


@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;
    private final WebClient.Builder webClientBuilder;


    public String placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItem> inventoryObservationItem = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        return null;
    }

    private OrderItem mapToDto(OrderItemsDto orderItemsDto) {
        OrderItem item = new OrderItem();
        item.setPrice(orderItemsDto.getPrice());
        item.setQuantity(orderItemsDto.getQuantity());
        item.setPrice(orderItemsDto.getPrice());
        return item;
    }

}
