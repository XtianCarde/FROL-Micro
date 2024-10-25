package com.frol.customer.api.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private Long id;
    private String name;
    private String lastname;
    private String email;
    private BigDecimal credits;
    private String phone;
}
