package com.htp.prowork.domain;


import java.sql.Timestamp;
import java.util.Objects;

public class Location {

  private Long id;
  private Long idWorker;
  private Double latitude;
  private Double longtitude;
  private Timestamp dateFrom;

  public Location() {
  }

  public Location(Long id, Long idWorker, Double latitude, Double longtitude, Timestamp dateFrom) {
    this.id = id;
    this.idWorker = idWorker;
    this.latitude = latitude;
    this.longtitude = longtitude;
    this.dateFrom = dateFrom;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdWorker() {
    return idWorker;
  }

  public void setIdWorker(Long idWorker) {
    this.idWorker = idWorker;
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

  public Timestamp getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Timestamp dateFrom) {
    this.dateFrom = dateFrom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Location location = (Location) o;
    return Objects.equals(id, location.id) &&
            Objects.equals(idWorker, location.idWorker) &&
            Objects.equals(latitude, location.latitude) &&
            Objects.equals(longtitude, location.longtitude) &&
            Objects.equals(dateFrom, location.dateFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idWorker, latitude, longtitude, dateFrom);
  }

  @Override
  public String toString() {
    return "Location{" +
            "id=" + id +
            ", idWorker=" + idWorker +
            ", latitude=" + latitude +
            ", longtitude=" + longtitude +
            ", dateFrom=" + dateFrom +
            '}';
  }
}
