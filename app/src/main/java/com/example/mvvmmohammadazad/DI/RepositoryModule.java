package com.example.mvvmmohammadazad.DI;

import android.app.Application;

import com.example.mvvmmohammadazad.NoteRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule
{

    @Provides
    public NoteRepository provideNoteRepository(Application application)
    {
        return new NoteRepository(application);
    }
}
