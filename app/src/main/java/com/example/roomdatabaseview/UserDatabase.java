package com.example.roomdatabaseview;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities ={UserEntity.class,UserEntity2.class},views = NewTable.class,exportSchema = false,version = 3)
public abstract class UserDatabase extends RoomDatabase {
    private static String DB_NAME = "DB";
    private static UserDatabase intance;

    public static synchronized UserDatabase getDatabase(Context context){
        if(intance == null){
            intance = Room.databaseBuilder(context,UserDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return intance;
    }

    public abstract UserDao storeDao();
}
