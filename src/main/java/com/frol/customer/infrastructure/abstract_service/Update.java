package com.frol.customer.infrastructure.abstract_service;

public interface Update<ID, RQ, RS> {

    RS update(ID id, RQ rq);
}
