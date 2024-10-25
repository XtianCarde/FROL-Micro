package com.frol.customer.infrastructure.abstract_service;

public interface Create<RQ, RS> {

    RS create(RQ rq);
}
