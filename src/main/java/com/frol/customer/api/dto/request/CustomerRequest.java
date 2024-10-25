package com.frol.customer.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    @NotBlank(message = "El nombre es requerido")
    private String name;
    @NotBlank(message = "El apellido es requerido")
    private String lastname;
    @NotBlank(message = "El email es requerido")
    private String email;
    @NotBlank(message = "El password es requerido")
    private String password;
    @NotBlank(message = "El telefono es requerido")
    private String phone;
}
