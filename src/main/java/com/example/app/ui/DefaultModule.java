package com.example.app.ui;

import com.example.app.objects.IStorage;
import com.example.app.objects.ITestable;
import com.example.app.objects.StorageImpl;
import com.example.app.objects.TestableImpl;
import dagger.Module;
import dagger.Provides;

@Module(
        injects = MyActivity.class,
        complete = false,
        library = true
)
public class DefaultModule {
    @Provides
    ITestable provideTestable() {
        return new TestableImpl();
    }
    @Provides
    IStorage provideStorage(){
        return new StorageImpl();
    }

}