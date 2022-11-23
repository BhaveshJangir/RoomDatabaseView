package com.example.roomdatabaseview;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserEntity2 {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "UserMobile")
    private String UserMobile;

    @ColumnInfo(name ="UserCity")
    private  String UserCity;

    @ColumnInfo(name = "Latitude")
    private Double Latitude;

    @ColumnInfo(name = "Longtitude")
    private Double Longtitude;


    public UserEntity2() {
    }

    public UserEntity2(int id, String userMobile, String userCity, Double latitude, Double longtitude) {
        this.id = id;
        UserMobile = userMobile;
        UserCity = userCity;
        Latitude = latitude;
        Longtitude = longtitude;
    }

    public UserEntity2(String userMobile, String userCity, Double latitude, Double longtitude) {
        UserMobile = userMobile;
        UserCity = userCity;
        Latitude = latitude;
        Longtitude = longtitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserMobile() {
        return UserMobile;
    }

    public void setUserMobile(String userMobile) {
        UserMobile = userMobile;
    }

    public String getUserCity() {
        return UserCity;
    }

    public void setUserCity(String userCity) {
        UserCity = userCity;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongtitude() {
        return Longtitude;
    }

    public void setLongtitude(Double longtitude) {
        Longtitude = longtitude;
    }
}
