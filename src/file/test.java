/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;


import java.io.File;
import java.io.IOException;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author 123
 */
public class test {
    public static void main(String[] args) throws IOException {
        File a=new File("C:\\Users\123/Desktop/a.png");
        File b=new File("src/img/abb.png");
       
       coppy.copyFile(a, b);
    }
}
