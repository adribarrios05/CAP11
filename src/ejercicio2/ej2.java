package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ej2 {
    public static void main(String[] args) {
        String fileName = "C:/Users/Adri/Desktop/1º DAM/Programación/CAP11/src/ejercicio1/primos.dat";
        File file = new File(fileName);

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String linea = "";
            
            if((linea = br.readLine()) != null)
                System.out.println(linea);
            br.close();
        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }
    }
}
