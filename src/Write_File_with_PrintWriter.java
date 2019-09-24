/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Write_File_with_PrintWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\OutSinhvien.txt");
        if(f.exists()){
            f.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(f);
        printWriter.write("B17DCCN642\nNguyen Van Tu\n3.25");
        printWriter.flush(); // xả stream
        printWriter.close(); // đóng stream
        // . append để thêm vào cuối file
    }
}
