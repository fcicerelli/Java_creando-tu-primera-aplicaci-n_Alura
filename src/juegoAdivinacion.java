import java.util.Random;
import java.util.Scanner;

public class juegoAdivinacion {
  public static void main(String[] args) {

    int numeroSorteado = new Random().nextInt(10);
    int intento = 0;
    int numeroElegido = 0;

    Scanner teclado = new Scanner(System.in);
    System.out.println(numeroSorteado);
    while (intento <= 5) {
      System.out.println("Ingrese un número del 1 al 10");
      numeroElegido = teclado.nextInt();

      if (numeroSorteado == numeroElegido) {
        System.out.println("Felicidades haz acertado, es el número %d".formatted(numeroSorteado));
        break;
      } else if (numeroSorteado < numeroElegido){
        System.out.println("No, el número no es %d, es Menor".formatted(numeroElegido));
      } else {
        System.out.println("No, el número no es %d, es Mayor".formatted(numeroElegido));
      }

      intento++;


    }

    if (intento >= 5) {
      System.out.println("Mala suerte, el número era: %d. No te rindas y juega de nuevo!".formatted(numeroSorteado));
    }

  }
}
