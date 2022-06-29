package com.example.mvvmmohammadazad.DI;

import android.app.Application;

import com.example.mvvmmohammadazad.NoteRepository;
import com.example.mvvmmohammadazad.NoteViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule
{

    @Provides
    public NoteViewModel provideNoteViewModel(Application application,
                                              NoteRepository repository)
    {
        return new NoteViewModel(application,repository);
    }
}
