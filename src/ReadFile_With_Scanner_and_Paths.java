/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ReadFile_With_Scanner_and_Paths {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(Paths.get("D:\\daonguoc.txt"), "UTF-8" );
       while(sc.hasNextLine()){
           String line = sc.nextLine();
           System.out.println(line);
       }
        
    }
}
