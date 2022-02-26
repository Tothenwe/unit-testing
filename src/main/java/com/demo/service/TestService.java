package com.demo.service;

public class TestService {
    OrderService orderService = OrderService.getInstance();

	public int checkInstance() {
		if (orderService != null)
			return 1;
		return 0;
	}
    public int test() {
        return 1;
    }
    public int checkPlaceOrder() {
		if (orderService.placeOrder(new Order(), "abc"))
			return 1;
		return 0;
	}
}
