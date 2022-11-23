package com.example.roomdatabaseview;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query("select * from UserEntity")
    List<UserEntity> userEntities();

    @Insert
    void addTable(UserEntity userEntity);

    @Query("select * from UserEntity2")
    List<UserEntity2> userEntities2();

    @Insert
    void addTable2(UserEntity2 userEntity2);

//    @Query("select * from UserTable2")
//    List<UserTable2> userEntities2();

//    @Query("select * from NewTable")
//    List<NewTable> getAllData();

//    @Query("SELECT \n" +
//            " id\n" +
//            "(\n" +
//            "   3959 *\n" +
//            "   acos(cos(radians(22.7344)) * \n" +
//            "   cos(radians(Latitude)) * \n" +
//            "   cos(radians(Longtitude) - \n" +
//            "   radians(75.8903)) + \n" +
//            "   sin(radians(22.7344)) * \n" +
//            "   sin(radians(Latitude)))\n" +
//            ")  \n" +
//            "FROM UserTable2 ")
//    List<NewTable> getAllDistance();

//    @Insert
//    void addTable2(UserTable2 userTable2);

//    @Query("select UserEntity.UserName,UserTable2.UserCity from UserEntity , UserTable2 where UserEntity.UserMobile=UserTable2.UserMobile")
//    List<NewTable> getNewData();

//    @Insert
//    void addNewTable(NewTable newTable);


}
