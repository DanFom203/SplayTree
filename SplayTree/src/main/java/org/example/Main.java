package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main (String[]args) throws IOException {
        Path path = Path.of("src/main/java/org/example/data");
        List<String> lines = Files.readAllLines(path);
        Tree<Integer> splayTree = new SplayTree<>();

        int count = 0;
        long start = System.nanoTime();
        for (String line : lines) {
            int x = Integer.parseInt(line);
            splayTree.insert(x);
            if (count == 999) {
                break;
            } else {count++;}
        }
        long finish = System.nanoTime();
        System.out.println("Insert_Time_Of_Elements: " + ((finish - start) / 1000));
        System.out.println(splayTree.find(832));
//
        //long start_Delete = System.nanoTime();
        //for (int i = 0; i < 1001; i++) {
        //    int x = (int) (Math.random() * 10000);
        //    splayTree.delete(x);
        //}
        //long finish_Delete = System.nanoTime();
        //System.out.println("Delete_Time_Of_Elements: " + ((finish_Delete - start_Delete) / 1000));
//
        //long start_Insertion = System.nanoTime();
        //for (int i = 0; i < 1001; i++) {
        //    int x = (int) ((Math.random() * 20000) + 10000);
        //    splayTree.insert(x);
        //}
        //long finish_Insertion = System.nanoTime();
        //System.out.println("Insert_Time_Of_Elements: " + ((finish_Insertion - start_Insertion) / 1000));


    }
}
