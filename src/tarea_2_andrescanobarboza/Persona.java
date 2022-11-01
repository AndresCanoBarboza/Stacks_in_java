
package tarea_2_andrescanobarboza;


public class Persona {
    
    private int id;
    private int edad;

          
    //Contructores
    
    public Persona(int id, int edad) {
        this.id = id;
        this.edad = edad;
    }

    Persona(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //set y get
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
} //FinClase
