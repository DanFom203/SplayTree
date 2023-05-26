package org.example;

import java.io.*;

public class FileGenerator {
    public static int[] generateFiles(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10000);
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        int[] m = generateFiles( 10000);
        File file = new File("src/main/java/org/example/data");
        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < m.length; ++i) {
            writer.write(m[i] + "\n");
        }
        writer.close();
    }
}
