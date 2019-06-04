package com.htp.domain.hibernate;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Order")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HibernateOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "type")
    private long type;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longtitude")
    private double longtitude;

    @Column(name = "id_client")
    private long idClient;

    @Column(name = "id_worker")
    private long idWorker;

    @Column(name = "count_orker")
    private long countWorker;

    @Column(name = "date_create")
    private java.sql.Timestamp dateCreate;

    @Column(name = "date_from_order")
    private java.sql.Timestamp dateFromOrder;

    @Column(name = "date_to_order")
    private java.sql.Timestamp dateToOrder;

    @Column(name = "id_worker_date_to")
    private long idWorkerDateTo;

    @Column(name = "status")
    private long status;

    @Column(name = "prioritet")
    private long prioritet;

    public HibernateOrder(long id, long type, String description, String address, double latitude, double longtitude, long idClient, long idWorker, long countWorker, Timestamp dateCreate, Timestamp dateFromOrder, Timestamp dateToOrder, long idWorkerDateTo, long status, long prioritet) {
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

    public HibernateOrder() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HibernateOrder orderHibernate = (HibernateOrder) o;
        return id == orderHibernate.id &&
                type == orderHibernate.type &&
                Double.compare(orderHibernate.latitude, latitude) == 0 &&
                Double.compare(orderHibernate.longtitude, longtitude) == 0 &&
                idClient == orderHibernate.idClient &&
                idWorker == orderHibernate.idWorker &&
                countWorker == orderHibernate.countWorker &&
                idWorkerDateTo == orderHibernate.idWorkerDateTo &&
                status == orderHibernate.status &&
                prioritet == orderHibernate.prioritet &&
                Objects.equals(description, orderHibernate.description) &&
                Objects.equals(address, orderHibernate.address) &&
                Objects.equals(dateCreate, orderHibernate.dateCreate) &&
                Objects.equals(dateFromOrder, orderHibernate.dateFromOrder) &&
                Objects.equals(dateToOrder, orderHibernate.dateToOrder);
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
