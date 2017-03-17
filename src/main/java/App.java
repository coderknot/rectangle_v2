import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter the length of your rectangle:");
    int length = Integer.parseInt(myConsole.readLine());

    System.out.println("Enter the width of your rectangle:");
    int width = Integer.parseInt(myConsole.readLine());

    Rectangle rectangle = new Rectangle(length, width);

    System.out.println("Is your rectangle a square, too? " + rectangle.isSquare());
  }
}
