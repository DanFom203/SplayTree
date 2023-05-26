package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class SplayTreeTests {

    private static SplayTree<Integer> splayTree;

    @BeforeAll
    public static void prepare() {
        splayTree = new SplayTree<>();
        for (int i = 0; i < 5000; i++) splayTree.insert(i);
        for (int j = 15000; j < 20000; j++) splayTree.insert(j);
    }

    @Test
    public void test_Find_100_Elements() {
        for (int i = 500; i < 600; i++) {
            splayTree.find(i);
            Assert.assertEquals(i + "", splayTree.find(i).toString());
        }
    }

    @Test
    public void test_Delete_1000_Elements() {
        for (int i = 15000; i < 16000; i++) {
            splayTree.delete(i);
            Assert.assertEquals(splayTree.getRoot(), splayTree.delete(i));
        }
    }

    @Test
    public void test_Insert_10000_Elements() {
        for (int i = 5000; i < 15000; i++) {
            splayTree.insert(i);
            Assert.assertEquals(splayTree.getRoot().toString(), splayTree.insert(i).toString());
        }
    }

}
