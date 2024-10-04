package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) {

        try {

            // Create a file output stream
            OutputStream fos = new FileOutputStream(filename);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // Write the file byte per byte
            for (int i = 0; i < sizeInBytes; i++) {
                bos.write(i);
            }

            // Close the file output stream
            bos.flush();
            bos.close();
            fos.close();

        } catch (Exception e) {

            throw new RuntimeException(e);

        }
    }
}
