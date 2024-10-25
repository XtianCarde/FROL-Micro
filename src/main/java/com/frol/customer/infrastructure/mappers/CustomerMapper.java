package com.frol.customer.infrastructure.mappers;

import com.frol.customer.api.dto.request.CustomerRequest;
import com.frol.customer.api.dto.response.CustomerResponse;
import com.frol.customer.domain.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "credits", ignore = true)
    })
    Customer requestToEntity(CustomerRequest customerRequest);

    CustomerResponse entityToResponse(Customer customer);
}
