public class OperadoresDeIncremento {

  public static void main(String[] args) {
    // Operadores de Incremento
    int num = 5;
    int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
    System.out.println(num); // imprime 6
    System.out.println(resultado); // imprime 6

    int num2 = 5;
    int resultado2 = num2++; //num es atribuido primero a la variable resultado y depués es incrementado para 6
    System.out.println(num2); // imprime 6
    System.out.println(resultado2); // imprime 5
  }
}
