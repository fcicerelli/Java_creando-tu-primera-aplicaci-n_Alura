public class SwithEjemplo {
  public static void main(String[] args) {
    int dia = 5;
    switch (dia) {
      case 1:
        System.out.println("El día es lunes");
        break;
      case 2:
        System.out.println("El día es martes");
        break;
      case 3:
        System.out.println("El día es miércoles");
        break;
      case 4:
        System.out.println("El día es jueves");
        break;
      case 5:
        System.out.println("El día es viernes");
        break;
      default:
        System.out.println("Día no válido");
    }
  }
}
