/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
 
        try {
            inStream = new FileInputStream(new File("C:\\Users/123/Desktop/a.png"));
            outStream = new FileOutputStream(new File("ab.png"));
 
            int length;
            byte[] buffer = new byte[1024];
 
            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}