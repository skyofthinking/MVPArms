package io.github.skyofthinking.busline.ui.query;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = BusLineQueryModule.class, dependencies = AppComponent.class)
public interface BusLineQueryComponent {
    void inject(BusLineQueryActivity activity);
}