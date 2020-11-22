package com.lombok.demo.cleanup;

import lombok.Cleanup;

import java.io.*;
import java.nio.file.Files;

public class CleanupExample {
    public void readData() throws java.io.IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        String fileName = "sample.txt";
        File file = new File(classLoader.getResource(fileName).getFile());
        @Cleanup InputStream in = new FileInputStream(file);
        @Cleanup OutputStream out = new FileOutputStream(file);
        out.write(in.readAllBytes(),0,in.readAllBytes().length);

    }


}

