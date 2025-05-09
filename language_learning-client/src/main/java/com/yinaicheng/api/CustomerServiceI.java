package com.yinaicheng.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.yinaicheng.dto.CustomerAddCmd;
import com.yinaicheng.dto.CustomerListByNameQry;
import com.yinaicheng.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
