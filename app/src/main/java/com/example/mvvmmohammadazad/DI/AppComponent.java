package com.example.mvvmmohammadazad.DI;

import com.example.mvvmmohammadazad.MainActivity;
import com.example.mvvmmohammadazad.NoteViewModel;

import dagger.Component;

@Component(modules = {AppModule.class, RepositoryModule.class,
               ViewModule.class })
public interface AppComponent
{
    void inject(MainActivity mainActivity);
    void inject(NoteViewModel noteViewModel);
}
