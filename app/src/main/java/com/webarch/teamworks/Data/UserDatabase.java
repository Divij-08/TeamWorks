package com.webarch.teamworks.Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.webarch.teamworks.model.User;

@Database(entities = {User.class},version = 1,exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDAO getUserDAO();

}
