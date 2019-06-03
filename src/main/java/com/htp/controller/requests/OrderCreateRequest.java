package com.htp.controller.requests;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;

public class OrderCreateRequest {

    private long type;
    private String description;
    private String address;
    private double latitude;
    private double longtitude;
    private long idClient;
    private long countWorker;
    private String dateFromOrder;
    private long status;
    private long prioritet;


    public OrderCreateRequest() {
    }

    public OrderCreateRequest(long type, String description, String address, double latitude, double longtitude, long idClient, long countWorker, String dateFromOrder, long status, long prioritet) {
        this.type = type;
        this.description = description;
        this.address = address;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.idClient = idClient;
        this.countWorker = countWorker;
        this.dateFromOrder = dateFromOrder;
        this.status = status;
        this.prioritet = prioritet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCreateRequest that = (OrderCreateRequest) o;
        return type == that.type &&
                Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.longtitude, longtitude) == 0 &&
                idClient == that.idClient &&
                countWorker == that.countWorker &&
                status == that.status &&
                prioritet == that.prioritet &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address) &&
                Objects.equals(dateFromOrder, that.dateFromOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, address, latitude, longtitude, idClient, countWorker, dateFromOrder, status, prioritet);
    }

    public String getDateFromOrder() {
        return dateFromOrder;
    }

    public void setDateFromOrder(String dateFromOrder) {
        this.dateFromOrder = dateFromOrder;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public long getCountWorker() {
        return countWorker;
    }

    public void setCountWorker(long countWorker) {
        this.countWorker = countWorker;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getPrioritet() {
        return prioritet;
    }

    public void setPrioritet(long prioritet) {
        this.prioritet = prioritet;
    }

    @Override
    public String toString() {
        return "OrderCreateRequest{" +
                "type=" + type +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longtitude=" + longtitude +
                ", idClient=" + idClient +
                ", countWorker=" + countWorker +
                ", dateFromOrder='" + dateFromOrder + '\'' +
                ", status=" + status +
                ", prioritet=" + prioritet +
                '}';
    }
}
