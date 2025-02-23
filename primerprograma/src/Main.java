public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int classificaion = (int) media / 2;
        System.out.println(classificaion);

        // ---------------------------

        // Operadores de Incremento
        int num = 5;
        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num2 = 5;
        int resultado2 = num2++; //num es atribuido primero a la variable resultado y depués es incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

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

        int gradosCelsius = 24;
        int gradosFarenheit = 0;

        gradosFarenheit = (int)(gradosCelsius * 1.8) + 32;
        System.out.println(gradosFarenheit);

        // ---------------------



                double temperaturaEnCelsius = 30.4;
                double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

                String mensaje2 = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

                System.out.println(mensaje2);

                int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
                System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);



    }
}