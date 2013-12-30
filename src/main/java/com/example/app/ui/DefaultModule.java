package com.example.app.ui;

import com.example.app.objects.IStorage;
import com.example.app.objects.ITestable;
import com.example.app.objects.QuickStorage;
import com.example.app.objects.TestableImpl;
import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                MyActivity.class,
                SampleIntentService.class
        },
        complete = false,
        library = true
)
public class DefaultModule {
    @Provides
    IStorage provideStorage(){
        return new QuickStorage();
    }
    @Provides
    ITestable provideTestable() {
        return new TestableImpl(provideStorage());
    }
}