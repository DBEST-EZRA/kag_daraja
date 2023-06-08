package com.example.kagdaraja.Database;


import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import  com.example.kagdaraja.Models.notes;

import java.util.List;

@Dao
public interface MainDAO {
    @Insert(onConflict = REPLACE)
    void insert(notes notes);

    @Query("Select * from notes order by id desc")
    List<notes> getAll();

    @Query("update notes set title = :title, notes = :notes where ID = :id")
    void update(int id, String title, String notes);

    @Delete
    void delete(notes notes);

    @Query("update notes set pinned = :pin where ID = :id")
    void pin(int id, boolean pin);

}

