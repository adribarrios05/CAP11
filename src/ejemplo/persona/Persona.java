package ejemplo.persona;

public class Persona{

    private String id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String id, String nombre, String apellidos, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String serialize(){
        return String.format("%s;%s;%s;%d", this.id, this.nombre, this.apellidos, this.edad);
    }
    public static Persona deSerialize(String persona) throws Exception{
        String nombre, apellidos, id;
        int edad;
        String[] valores = persona.split(";");
        if(valores.length!=4){
            throw new Exception("Not enough parameters for person");
        }
        id = valores[0];
        nombre = valores[1];
        apellidos = valores[2];
        edad = Integer.parseInt(valores[3]);

        return new Persona(id, nombre, apellidos, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("Id: %s%nNombre: %s%nApellidos: %s%nEdad: %d%n", this.id, this.nombre, this.apellidos, this.edad);
    }
}
