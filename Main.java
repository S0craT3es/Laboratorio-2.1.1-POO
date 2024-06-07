public class Main {
    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        
        // Capturar datos de los estudiantes usando métodos setGet
        estudiante1.setGetNombre("Juan Perez");
        estudiante1.setGetEdad(20);
        estudiante1.setGetCarrera("Ingeniería en Software");
        
        estudiante2.setGetNombre("Maria Lopez");
        estudiante2.setGetEdad(22);
        estudiante2.setGetCarrera("Ingeniería Civil");
        
        estudiante3.setGetNombre("Carlos Gomez");
        estudiante3.setGetEdad(21);
        estudiante3.setGetCarrera("Ingeniería Mecánica");
        
        // Desplegar datos de los estudiantes usando métodos setGet
        System.out.println("Estudiante 1: " + estudiante1.setGetNombre(null) + ", " + estudiante1.setGetEdad(null) + " años, " + estudiante1.setGetCarrera(null));
        System.out.println("Estudiante 2: " + estudiante2.setGetNombre(null) + ", " + estudiante2.setGetEdad(null) + " años, " + estudiante2.setGetCarrera(null));
        System.out.println("Estudiante 3: " + estudiante3.setGetNombre(null) + ", " + estudiante3.setGetEdad(null) + " años, " + estudiante3.setGetCarrera(null));
    }
}
