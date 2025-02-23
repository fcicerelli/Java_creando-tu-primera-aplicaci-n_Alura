public class StringFormateado {

  public static void main(String[] args) {

    String nombre = "Maria";
    int edad = 30;
    double valor = 55.9999;
    System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

    String nombreAlumno = "Juan";
    int aulas = 4;

    String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombreAlumno, aulas);

    System.out.println(mensaje);
  }
}
