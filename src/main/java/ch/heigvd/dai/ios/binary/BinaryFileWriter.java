package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) {

        try {

            // Create a file output stream
            OutputStream fos = new FileOutputStream(filename);

            // Write the file byte per byte
            for (int i = 0; i < sizeInBytes; i++) {
                fos.write(i);
            }

            // Close the file output stream
            fos.close();

        } catch (Exception e) {

            throw new RuntimeException(e);

        }
    }
}
