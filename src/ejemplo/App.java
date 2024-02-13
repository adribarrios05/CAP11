package ejemplo;
import java.util.ArrayList;

import ejemplo.persona.Persona;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        if(args.length!=1)
            System.out.println("Not enough arguments");
        String fileName = args[0];
        File file = new File(fileName);
        ArrayList<Persona> personas = new ArrayList<>();
        if(!file.exists()){
            personas.add(new Persona("1", "Juan" , "Garcia", 47));
            personas.add(new Persona("2", "Alejandro" , "Perez", 34));
        } else{
            BufferedReader br = new BufferedReader(new FileReader("."));
            String linea = "";
            while((linea = br.readLine()) != null){
                
            }
        }
    }
}
