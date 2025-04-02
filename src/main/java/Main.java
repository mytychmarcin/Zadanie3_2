public class Main {
  public static void main(String[] args) {
    int galezie = 3;
    int dlugosc = 4;

    for (int l = 0; l < galezie; l++) {
      for (int i = 0; i < dlugosc; i++) {
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j < 2 * (dlugosc - i) - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
