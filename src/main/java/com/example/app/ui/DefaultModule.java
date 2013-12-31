package com.example.app.ui;

import android.content.Context;
import com.example.app.objects.*;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

@Module(
        injects = {
            MyActivity.class,
            SampleIntentService.class
        },
        complete = false,
        library = true
)
public class DefaultModule {
    Context context;

    @Inject
    public DefaultModule(Context context) {
        this.context = context;
    }

    @Provides
    IStorage provideStorage(){
        return new QuickStorage();
    }

    @Provides
    ITestable provideTestable() {
        return new TestableImpl(provideStorage());
    }

    @Provides
    ISettings provideSettings() {
        return new SettingsWrapper(context);
    }
}