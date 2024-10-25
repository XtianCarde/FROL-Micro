package com.frol.customer.infrastructure.abstract_service;

public interface ReadById<ID, RS> {

    RS readById(ID id);
}
