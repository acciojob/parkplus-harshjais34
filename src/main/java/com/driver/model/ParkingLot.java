package com.driver.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkingLotId;
    private String name;
    private String address;


    public ParkingLot() {
    }


    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @OneToMany(mappedBy = "parkingLot", cascade = CascadeType.ALL)
    private List<Spot> spotList;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public List<Spot> getSpotList() {
        return spotList;
    }


    public void setSpotList(List<Spot> spotList) {
        this.spotList = spotList;
    }


    public int getParkingLotId() {
        return parkingLotId;
    }


    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}