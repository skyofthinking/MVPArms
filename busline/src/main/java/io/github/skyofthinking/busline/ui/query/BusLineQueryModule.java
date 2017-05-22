package io.github.skyofthinking.busline.ui.query;

import com.google.gson.Gson;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class BusLineQueryModule {
    private BusLineQueryContract.View view;

    /**
     * 构建BusLineQueryModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BusLineQueryModule(BusLineQueryContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BusLineQueryContract.View provideBusLineQueryView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BusLineQueryContract.Model provideBusLineQueryModel(BusLineQueryModel model) {
        return model;
    }
}