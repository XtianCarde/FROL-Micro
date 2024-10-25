package com.frol.customer.infrastructure.services;

import com.frol.customer.api.dto.request.CustomerRequest;
import com.frol.customer.api.dto.response.CustomerResponse;
import com.frol.customer.domain.entity.Customer;
import com.frol.customer.domain.repository.CustomerRepository;
import com.frol.customer.infrastructure.abstract_service.CustomerService;
import com.frol.customer.infrastructure.mappers.CustomerMapper;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        Customer customer = this.customerMapper.requestToEntity(customerRequest);
        customer.setCredits(new BigDecimal(0));
        return this.customerMapper.entityToResponse(this.customerRepository.save(customer));
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public CustomerResponse readById(Long aLong) {
        return null;
    }

    @Override
    public CustomerResponse update(Long aLong, CustomerRequest customerRequest) {
        return null;
    }
}
