package com.example.mvvmmohammadazad.DI;

import android.app.Application;

public class InitApplication extends Application
{
    AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().
                appModule(new AppModule(this))
                .repositoryModule(new RepositoryModule())
                .viewModule(new ViewModule())
                .build();
    }
    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
