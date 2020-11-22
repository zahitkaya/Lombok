package com.lombok.demo.cleanup;

import lombok.Cleanup;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CleanupExampleTest {

    @Test
    void readData() throws IOException {
        CleanupExample cleanupExample=new CleanupExample();
        cleanupExample.readData();
    }
}