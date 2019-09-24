/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 *  Ghi nhi phan = fileInput/OutputStream
 */
public class Read_File_with_Scanner {
    public static void main(String[] args) {
        File f = new File("Sinhvien.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            scanner.close();
        }
    }
}
