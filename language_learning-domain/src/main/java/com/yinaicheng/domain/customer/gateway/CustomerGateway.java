package com.yinaicheng.domain.customer.gateway;

import com.yinaicheng.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
