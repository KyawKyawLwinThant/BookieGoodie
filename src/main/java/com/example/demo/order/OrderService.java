package com.example.demo.order;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class OrderService {
	private final OrderRepository orderRepository;
}
