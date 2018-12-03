package com.helen.non_stand_inp_outp;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
    public static void fileWriter(String start,String stOutputFile) {

        try (FileWriter writer = new FileWriter(stOutputFile, false)) {
            Object[] paths = Files.walk(Paths.get(start)).toArray();
            for (Object i: paths) {
                writer.write(i.toString() + '\n');
            }
            writer.flush();

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (SecurityException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
