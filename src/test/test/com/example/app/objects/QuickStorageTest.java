package com.example.app.objects;

import dagger.ObjectGraph;
import org.junit.*;

import javax.inject.Inject;

import static junit.framework.Assert.*;

//TODO play with Mockito
public class QuickStorageTest {
    ObjectGraph graph;
   @Inject
   IStorage storage;

    @Before
    public void setUp() throws Exception {
        graph = ObjectGraph.create(DiModule.class);
        graph.inject(this);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSave() throws Exception {
        storage.save("test");
        assertEquals("test", storage.load());
    }

    @Test
    public void testLoad() throws Exception {

    }

    @Test
    public void testSetFile() throws Exception {

    }
}
