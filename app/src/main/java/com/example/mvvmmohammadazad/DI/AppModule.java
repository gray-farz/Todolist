package com.example.mvvmmohammadazad.DI;

import android.app.Application;

import com.example.mvvmmohammadazad.NoteRepository;
import com.example.mvvmmohammadazad.NoteViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    Application application;

    public AppModule(Application application) {
        this.application = application;

    }

    @Provides
    public Application provideApplication()
    {
        return application;
    }

}
