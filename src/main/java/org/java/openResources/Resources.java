package org.java.openResources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resources {

    public void writeToFile() {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt"))){
            printWriter.println("test");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
