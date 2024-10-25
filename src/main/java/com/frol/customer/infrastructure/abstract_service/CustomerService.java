package com.frol.customer.infrastructure.abstract_service;

import com.frol.customer.api.dto.request.CustomerRequest;
import com.frol.customer.api.dto.response.CustomerResponse;

public interface CustomerService extends Create<CustomerRequest, CustomerResponse>,
                                            ReadById<Long, CustomerResponse>,
                                            Update<Long, CustomerRequest, CustomerResponse>,
                                            Delete<Long>{
}
