package com.htp.prowork.controller.requests;

import java.util.Objects;

public class OrderCreateRequest {

    private Long type;
    private String description;
    private String address;
    private Double latitude;
    private Double longtitude;
    private Long idClient;
    private Long countWorker;
    private String dateFromOrder;
    private Long status;
    private Long prioritet;

    public OrderCreateRequest() {
    }

    public OrderCreateRequest(Long type, String description, String address, Double latitude, Double longtitude, Long idClient, Long countWorker, String dateFromOrder, Long status, Long prioritet) {
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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getCountWorker() {
        return countWorker;
    }

    public void setCountWorker(Long countWorker) {
        this.countWorker = countWorker;
    }

    public String getDateFromOrder() {
        return dateFromOrder;
    }

    public void setDateFromOrder(String dateFromOrder) {
        this.dateFromOrder = dateFromOrder;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getPrioritet() {
        return prioritet;
    }

    public void setPrioritet(Long prioritet) {
        this.prioritet = prioritet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCreateRequest that = (OrderCreateRequest) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longtitude, that.longtitude) &&
                Objects.equals(idClient, that.idClient) &&
                Objects.equals(countWorker, that.countWorker) &&
                Objects.equals(dateFromOrder, that.dateFromOrder) &&
                Objects.equals(status, that.status) &&
                Objects.equals(prioritet, that.prioritet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, address, latitude, longtitude, idClient, countWorker, dateFromOrder, status, prioritet);
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
