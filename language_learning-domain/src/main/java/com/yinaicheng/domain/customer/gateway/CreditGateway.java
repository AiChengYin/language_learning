package com.yinaicheng.domain.customer.gateway;

import com.yinaicheng.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
