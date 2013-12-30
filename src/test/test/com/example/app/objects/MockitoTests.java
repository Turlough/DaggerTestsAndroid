package com.example.app.objects;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

import static junit.framework.Assert.assertEquals;

public class MockitoTests {
    @Inject
    IStorage storage;


    @Before
    public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

    @Module(
            injects = MockitoTests.class
    )
    static class TestModule {
        @Provides
        IStorage provideHeater() {
            return Mockito.mock(IStorage.class);
        }
    }
//just playing with Mockito
    @Test
    public void canSetMockitoExpectations() {
        Mockito.when(storage.load()).thenReturn("Mock Storage");
        storage.save("bad shit");
        assertEquals("Mock Storage", storage.load());
    }
}
