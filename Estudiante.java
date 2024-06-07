public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String carrera;
    
    // Constructor
    public Estudiante() {}
    
    // Métodos set y get para cada atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public String getCarrera() {
        return this.carrera;
    }
    
    // Método setGet para manejar valores de un atributo
    public String setGetNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        return this.nombre;
    }
    
    public int setGetEdad(Integer edad) {
        if (edad != null) {
            this.edad = edad;
        }
        return this.edad;
    }
    
    public String setGetCarrera(String carrera) {
        if (carrera != null) {
            this.carrera = carrera;
        }
        return this.carrera;
    }
}
