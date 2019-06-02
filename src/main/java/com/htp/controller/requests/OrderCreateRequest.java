package com.htp.controller.requests;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class OrderCreateRequest {

    private long type;

    public OrderCreateRequest() {
    }

    public OrderCreateRequest(long type) {
        this.type = type;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCreateRequest that = (OrderCreateRequest) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "OrderCreateRequest{" +
                "type=" + type +
                '}';
    }
}
