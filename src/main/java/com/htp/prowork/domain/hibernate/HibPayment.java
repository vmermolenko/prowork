package com.htp.prowork.domain.hibernate;


import java.sql.Timestamp;
import java.util.Objects;

public class HibPayment {

  private Long id;
  private Long workerId;
  private Double summ;
  private Timestamp datePay;
  private Long type;
  private Long operatorId;

  public HibPayment() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getWorkerId() {
    return workerId;
  }

  public void setWorkerId(Long workerId) {
    this.workerId = workerId;
  }

  public Double getSumm() {
    return summ;
  }

  public void setSumm(Double summ) {
    this.summ = summ;
  }

  public Timestamp getDatePay() {
    return datePay;
  }

  public void setDatePay(Timestamp datePay) {
    this.datePay = datePay;
  }

  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Long getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Long operatorId) {
    this.operatorId = operatorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HibPayment payment = (HibPayment) o;
    return Objects.equals(id, payment.id) &&
            Objects.equals(workerId, payment.workerId) &&
            Objects.equals(summ, payment.summ) &&
            Objects.equals(datePay, payment.datePay) &&
            Objects.equals(type, payment.type) &&
            Objects.equals(operatorId, payment.operatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workerId, summ, datePay, type, operatorId);
  }

  @Override
  public String toString() {
    return "HibPayment{" +
            "id=" + id +
            ", workerId=" + workerId +
            ", summ=" + summ +
            ", datePay=" + datePay +
            ", type=" + type +
            ", operatorId=" + operatorId +
            '}';
  }
}
