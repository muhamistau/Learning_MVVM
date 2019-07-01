package com.islam.mvvm;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    // Inserting a Note to a table
    @Insert
    void insert(Note note);

    // Updating a Note that already exist in the table
    @Update
    void update(Note note);

    // Deleting a Note from a table
    @Delete
    void delete(Note note);

    // Delete all Note(s) from the table
    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    // Get all Note(s) from table with descending order
    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes(); // Any change will notify activity automatically
}
