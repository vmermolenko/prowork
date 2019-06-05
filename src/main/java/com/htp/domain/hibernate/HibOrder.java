package com.htp.domain.hibernate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.htp.domain.Client;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "prowork.order")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HibOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private Long type;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longtitude")
    private Double longtitude;

    @Column(name = "id_client", nullable=false, insertable=false, updatable=false)
    private Long idClient;

    @Column(name = "id_worker")
    private Long idWorker;

    @Column(name = "count_worker")
    private Long countWorker;

    @Column(name = "date_create")
    private java.sql.Timestamp dateCreate;

    @Column(name = "date_from_order")
    private java.sql.Timestamp dateFromOrder;

    @Column(name = "date_to_order")
    private java.sql.Timestamp dateToOrder;

    @Column(name = "id_worker_date_to")
    private Long idWorkerDateTo;

    @Column(name = "status")
    private Long status;

    @Column(name = "prioritet")
    private Long prioritet;

    /*
    @ManyToOne
    @JoinColumn(name="id_client", nullable=false)
    private HibClient client;
*/
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_client")
    private HibClient  hibClient;

    public HibOrder() {
    }

    public HibClient getHibClient() {
        return hibClient;
    }

    public void setHibClient(HibClient hibClient) {
        this.hibClient = hibClient;
    }

    public HibOrder(Long type, String description, String address, Double latitude, Double longtitude, Long idClient, Long idWorker, Long countWorker, Timestamp dateCreate, Timestamp dateFromOrder, Timestamp dateToOrder, Long idWorkerDateTo, Long status, Long prioritet, HibClient hibClient) {
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
        this.hibClient = hibClient;
    }

    public HibOrder(Long type, String description, String address, Double latitude, Double longtitude, Long idClient, Long idWorker, Long countWorker, Timestamp dateCreate, Timestamp dateFromOrder, Timestamp dateToOrder, Long idWorkerDateTo, Long status, Long prioritet) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(Long idWorker) {
        this.idWorker = idWorker;
    }

    public Long getCountWorker() {
        return countWorker;
    }

    public void setCountWorker(Long countWorker) {
        this.countWorker = countWorker;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Timestamp getDateFromOrder() {
        return dateFromOrder;
    }

    public void setDateFromOrder(Timestamp dateFromOrder) {
        this.dateFromOrder = dateFromOrder;
    }

    public Timestamp getDateToOrder() {
        return dateToOrder;
    }

    public void setDateToOrder(Timestamp dateToOrder) {
        this.dateToOrder = dateToOrder;
    }

    public Long getIdWorkerDateTo() {
        return idWorkerDateTo;
    }

    public void setIdWorkerDateTo(Long idWorkerDateTo) {
        this.idWorkerDateTo = idWorkerDateTo;
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
        HibOrder that = (HibOrder) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longtitude, that.longtitude) &&
                Objects.equals(idClient, that.idClient) &&
                Objects.equals(idWorker, that.idWorker) &&
                Objects.equals(countWorker, that.countWorker) &&
                Objects.equals(dateCreate, that.dateCreate) &&
                Objects.equals(dateFromOrder, that.dateFromOrder) &&
                Objects.equals(dateToOrder, that.dateToOrder) &&
                Objects.equals(idWorkerDateTo, that.idWorkerDateTo) &&
                Objects.equals(status, that.status) &&
                Objects.equals(prioritet, that.prioritet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, description, address, latitude, longtitude, idClient, idWorker, countWorker, dateCreate, dateFromOrder, dateToOrder, idWorkerDateTo, status, prioritet);
    }

    @Override
    public String toString() {
        return "HibOrder{" +
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
