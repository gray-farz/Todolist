package com.example.mvvmmohammadazad;

import android.app.Application;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import javax.inject.Inject;

public class NoteViewModel extends AndroidViewModel {

    @Inject
    NoteRepository repository;

    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application,
                         NoteRepository repository) {
        super(application);
        //repository = new NoteRepository(application);
        this.repository=repository;
        allNotes = repository.getAllNotes();
    }

    public void insert(Note note) {
        repository.insert(note);
    }
//
    public void update(Note note) {
        repository.update(note);
    }
//
    public void delete(Note note) {
        repository.delete(note);
    }
//
    public void deleteAllNotes() {
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}
