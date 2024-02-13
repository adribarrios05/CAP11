package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        String fichero1 = "C:/Users/Adri/Desktop/1º DAM/Programación/CAP11/src/ejercicio3/fichero1.txt";
        String fichero2 = "C:/Users/Adri/Desktop/1º DAM/Programación/CAP11/src/ejercicio3/fichero2.txt";
        String ficheroCopia = "C:/Users/Adri/Desktop/1º DAM/Programación/CAP11/src/ejercicio3/ficheroCopia.txt";
        File file1 = new File(fichero1);
        File file2 = new File(fichero2);
        File fileCopia = new File(ficheroCopia);

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopia));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 = br1.readLine()) != null && (linea2 = br2.readLine()) != null) {
                bw.write(linea1 + "\n");
                bw.write(linea2 + "\n");
            }

            while (linea1 != null) {
                bw.write(linea1 + "\n");
                linea1 = br1.readLine();
            }

            while (linea2 != null) {
                bw.write(linea2 + "\n");
                linea2 = br2.readLine();
            }

            br1.close();
            br2.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el archivo");
        }
    }
}
