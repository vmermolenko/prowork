package com.htp.prowork.domain.hibernate;


import java.sql.Timestamp;
import java.util.Objects;

public class HibNumberWorker {

  private Long id;
  private Long idOrder;
  private Long idWorker;
  private Long numberWorker;
  private Timestamp dateFrom;
  private Timestamp dateTo;
  private Timestamp dateCancel;

  public HibNumberWorker() {
  }
  public HibNumberWorker(Long id, Long idOrder, Long idWorker, Long numberWorker, Timestamp dateFrom, Timestamp dateTo, Timestamp dateCancel) {
    this.id = id;
    this.idOrder = idOrder;
    this.idWorker = idWorker;
    this.numberWorker = numberWorker;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.dateCancel = dateCancel;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Long idOrder) {
    this.idOrder = idOrder;
  }

  public Long getIdWorker() {
    return idWorker;
  }

  public void setIdWorker(Long idWorker) {
    this.idWorker = idWorker;
  }

  public Long getNumberWorker() {
    return numberWorker;
  }

  public void setNumberWorker(Long numberWorker) {
    this.numberWorker = numberWorker;
  }

  public Timestamp getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Timestamp dateFrom) {
    this.dateFrom = dateFrom;
  }

  public Timestamp getDateTo() {
    return dateTo;
  }

  public void setDateTo(Timestamp dateTo) {
    this.dateTo = dateTo;
  }

  public Timestamp getDateCancel() {
    return dateCancel;
  }

  public void setDateCancel(Timestamp dateCancel) {
    this.dateCancel = dateCancel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HibNumberWorker that = (HibNumberWorker) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(idOrder, that.idOrder) &&
            Objects.equals(idWorker, that.idWorker) &&
            Objects.equals(numberWorker, that.numberWorker) &&
            Objects.equals(dateFrom, that.dateFrom) &&
            Objects.equals(dateTo, that.dateTo) &&
            Objects.equals(dateCancel, that.dateCancel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idOrder, idWorker, numberWorker, dateFrom, dateTo, dateCancel);
  }

  @Override
  public String toString() {
    return "HibNumberWorker{" +
            "id=" + id +
            ", idOrder=" + idOrder +
            ", idWorker=" + idWorker +
            ", numberWorker=" + numberWorker +
            ", dateFrom=" + dateFrom +
            ", dateTo=" + dateTo +
            ", dateCancel=" + dateCancel +
            '}';
  }
}
