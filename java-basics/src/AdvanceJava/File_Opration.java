package AdvanceJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// File Handling...........
public class File_Opration {
    public static void main(String[] args) {
        File obj = new File("Yuvi.txt");
        try {
            obj.createNewFile();            // to create the File
            System.out.println("File Created");
        }
        catch (IOException e){
            System.out.println("File not Created");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter =new FileWriter("Yuvi.txt");
            fileWriter.write("i am Vishwajeet bharti");
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Error to write the file");
            e.printStackTrace();
        }
//       try{
//           Scanner sc =new Scanner(obj);
//           while(sc.hasNextLine()){     //Reading File Lines
//               String line = sc.nextLine();
//               System.out.println(line);
//           }
//           sc.close();
//       }
//       catch (FileNotFoundException e){
//           e.printStackTrace();
//       }
//       if(obj.delete()){
//           System.out.println("Deleted");
//       }
//       else{
//           System.out.println("not deleted");
//       }


    }
}
