/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Paths;

/**
 *
 * @author Admin
 */
public class WriteFile_With_Prinwriter_and_URL {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\Output.txt");
        if(f.exists()){
            f.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(f);
        printWriter.write("Hello Tu Nguyen\n"); // ghi file
        printWriter.append("Cố gắng học nào !"); // thêm vào cuối file
        printWriter.flush();
        printWriter.close();
    }
}
