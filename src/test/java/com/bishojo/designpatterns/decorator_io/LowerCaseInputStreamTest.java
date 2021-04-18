package com.bishojo.designpatterns.decorator_io;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;

public class LowerCaseInputStreamTest {

    private static final String filePath = "files" + File.separator + "test.txt";

    @BeforeAll
    public static void setUp() throws IOException {
        File file = new File(filePath);
        file.createNewFile();

        String string = "HELLO";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(string);

        writer.close();
    }

    @Test
    public void testInputConvertedToLowerCase() {
        char character = 't';

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(filePath)));

            character = (char)in.read();
            in.close();
        } catch (IOException e) {
        }

        Assertions.assertEquals(character, 'h');
    }

    @AfterAll
    public static void tearDown() {
        File file = new File(filePath);
        file.delete();
    }
}
