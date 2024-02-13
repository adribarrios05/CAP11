package ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;



public class ej1 {

    public static boolean esDivisor(int a, int b){
        return (b % a)==0;
    }

    public static boolean esPrimo(int a){
        if(a<2)
            return false;
        boolean primo=true;
        for (int i=2; i<=a/2 && primo;i++){
            if(esDivisor(i, a))
                primo = false;
        }
        return primo;
    }

    public static void main(String[] args) throws Exception {
        String fileName = "C:/Users/Adri/Desktop/1º DAM/Programación/CAP11/src/ejercicio1/primos.dat";
        File file = new File(fileName);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            String linea = "";
            for(int i = 2; i<=500; i++){
                if(esPrimo(i)){
                    bw.write(i+" ");
                    System.out.print(i+" ");
                }
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
        }
        
        
        }
    }
