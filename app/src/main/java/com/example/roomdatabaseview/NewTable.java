package com.example.roomdatabaseview;

import androidx.room.ColumnInfo;
import androidx.room.DatabaseView;
import androidx.room.PrimaryKey;


@DatabaseView("SELECT t1.id, t1.UserName,t2.UserCity, t2.Latitude, t2.Longtitude " +
        "FROM  UserEntity t1, UserEntity2 t2 where t1.UserMobile=t2.UserMobile")
public class NewTable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "UserName")
    private String UserName;

    @ColumnInfo(name = "UserCity")
    private  String UserCity;

    @ColumnInfo(name = "Latitude")
    private  Double Latitude;

    @ColumnInfo(name = "Longtitude")
    private  Double Longtitude;

    @ColumnInfo(name = "abc")
    private  Double abc;


    public NewTable() {
    }

    public NewTable(int id, String userName, String userCity, Double latitude, Double longtitude, Double abc) {
        this.id = id;
        UserName = userName;
        UserCity = userCity;
        Latitude = latitude;
        Longtitude = longtitude;
        this.abc = abc;
    }

    public NewTable(String userName, String userCity, Double latitude, Double longtitude) {
        UserName = userName;
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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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

    public Double getAbc() {
        return abc;
    }

    public void setAbc(Double abc) {
        this.abc = abc;
    }
}
