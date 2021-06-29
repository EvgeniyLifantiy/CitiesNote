package com.SberStart.CityNote;

import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    @Test
    public void testConnect(){

        try {
          Scanner scanner = new Scanner(Paths.get("src/main/resources/File.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
