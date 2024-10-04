package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file byte per byte. It manages the
 * file reader properly with a try-catch-finally block.
 */
public class TextFileReader implements Readable {

    @Override
    public void read(String filename) {

        try (Reader reader = new FileReader(filename, StandardCharsets.UTF_8)) {

            // -1 indicates the end of the file
            int b;
            while ((b = reader.read()) != -1) {
                System.out.print(b);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
