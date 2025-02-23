public class ConversorDeTemperatura {

  public static void main(String[] args) {

    // Mi respuesta
    int gradosCelsius = 24;
    int gradosFarenheit = 0;

    gradosFarenheit = (int)(gradosCelsius * 1.8) + 32;
    System.out.println(gradosFarenheit);

    // Respuesta de la profesora

    double temperaturaEnCelsius = 30.4;
    double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

    String mensaje2 = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

    System.out.println(mensaje2);

    int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
    System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);

  }
}
