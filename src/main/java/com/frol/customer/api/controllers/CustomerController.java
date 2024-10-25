package com.frol.customer.api.controllers;

import com.frol.customer.api.dto.request.CustomerRequest;
import com.frol.customer.api.dto.response.CustomerResponse;
import com.frol.customer.infrastructure.abstract_service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponse> create(@Validated @RequestBody CustomerRequest rq){
        return ResponseEntity.ok( this.customerService.create(rq) );
    }
}
