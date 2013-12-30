package com.example.app.objects;


import dagger.Module;
import dagger.Provides;

@Module(
        injects = QuickStorageTest.class,
        complete = false,
        library = true
)
public class DiModule {
    @Provides
    IStorage provideStorage(){
        return new QuickStorage();
    }
    @Provides
    ITestable provideTestable() {
        return new TestableImpl(provideStorage());
    }
}
