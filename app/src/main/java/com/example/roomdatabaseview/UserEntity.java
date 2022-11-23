package com.example.roomdatabaseview;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "StoreName")
    private String StoreName;

    @ColumnInfo(name = "UserName")
    private String UserName;

    @ColumnInfo(name = "UserMobile")
    private String UserMobile;

    public UserEntity() {
    }

    public UserEntity(int id, String userName, String userMobile) {
        this.id = id;
        UserName = userName;
        UserMobile = userMobile;
    }


    public UserEntity(String storeName, String userName, String userMobile) {
        StoreName = storeName;
        UserName = userName;
        UserMobile = userMobile;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
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

    public String getUserMobile() {
        return UserMobile;
    }

    public void setUserMobile(String userMobile) {
        UserMobile = userMobile;
    }
}
