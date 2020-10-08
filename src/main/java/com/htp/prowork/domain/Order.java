package com.htp.prowork.domain;


import java.sql.Timestamp;
import java.util.Objects;

public class Order {

  private long id;
  private long type;
  private String description;
  private String address;
  private double latitude;
  private double longtitude;
  private long idClient;
  private long idWorker;
  private long countWorker;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateFromOrder;
  private java.sql.Timestamp dateToOrder;
  private long idWorkerDateTo;
  private long status;
  private long prioritet;

  public Order(long id, long type, String description, String address, double latitude, double longtitude, long idClient, long idWorker, long countWorker, Timestamp dateCreate, Timestamp dateFromOrder, Timestamp dateToOrder, long idWorkerDateTo, long status, long prioritet) {
    this.id = id;
    this.type = type;
    this.description = description;
    this.address = address;
    this.latitude = latitude;
    this.longtitude = longtitude;
    this.idClient = idClient;
    this.idWorker = idWorker;
    this.countWorker = countWorker;
    this.dateCreate = dateCreate;
    this.dateFromOrder = dateFromOrder;
    this.dateToOrder = dateToOrder;
    this.idWorkerDateTo = idWorkerDateTo;
    this.status = status;
    this.prioritet = prioritet;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getIdWorker() {
    return idWorker;
  }

  public void setIdWorker(long idWorker) {
    this.idWorker = idWorker;
  }


  public long getCountWorker() {
    return countWorker;
  }

  public void setCountWorker(long countWorker) {
    this.countWorker = countWorker;
  }


  public java.sql.Timestamp getDateCreate() {
    return dateCreate;
  }

  public void setDateCreate(java.sql.Timestamp dateCreate) {
    this.dateCreate = dateCreate;
  }


  public java.sql.Timestamp getDateFromOrder() {
    return dateFromOrder;
  }

  public void setDateFromOrder(java.sql.Timestamp dateFromOrder) {
    this.dateFromOrder = dateFromOrder;
  }


  public java.sql.Timestamp getDateToOrder() {
    return dateToOrder;
  }

  public void setDateToOrder(java.sql.Timestamp dateToOrder) {
    this.dateToOrder = dateToOrder;
  }


  public long getIdWorkerDateTo() {
    return idWorkerDateTo;
  }

  public void setIdWorkerDateTo(long idWorkerDateTo) {
    this.idWorkerDateTo = idWorkerDateTo;
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

  public Order() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order order = (Order) o;
    return id == order.id &&
            type == order.type &&
            Double.compare(order.latitude, latitude) == 0 &&
            Double.compare(order.longtitude, longtitude) == 0 &&
            idClient == order.idClient &&
            idWorker == order.idWorker &&
            countWorker == order.countWorker &&
            idWorkerDateTo == order.idWorkerDateTo &&
            status == order.status &&
            prioritet == order.prioritet &&
            Objects.equals(description, order.description) &&
            Objects.equals(address, order.address) &&
            Objects.equals(dateCreate, order.dateCreate) &&
            Objects.equals(dateFromOrder, order.dateFromOrder) &&
            Objects.equals(dateToOrder, order.dateToOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, description, address, latitude, longtitude, idClient, idWorker, countWorker, dateCreate, dateFromOrder, dateToOrder, idWorkerDateTo, status, prioritet);
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", type=" + type +
            ", description='" + description + '\'' +
            ", address='" + address + '\'' +
            ", latitude=" + latitude +
            ", longtitude=" + longtitude +
            ", idClient=" + idClient +
            ", idWorker=" + idWorker +
            ", countWorker=" + countWorker +
            ", dateCreate=" + dateCreate +
            ", dateFromOrder=" + dateFromOrder +
            ", dateToOrder=" + dateToOrder +
            ", idWorkerDateTo=" + idWorkerDateTo +
            ", status=" + status +
            ", prioritet=" + prioritet +
            '}';
  }
}
