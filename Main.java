import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    p1.setX(in_x);
    p2.setX(in_y);

    Dog d = new Dog();
    d.setBreed("terrier");
    System.out.println(d.getBreed());

    System.out.println("You made a point at (" + p1.getX() + "," + p2.getY() + ")")

    //p1.x = 0;
    //p2.y = 1;

    //p2.x = 1;
    //p2.y = 0;

    Dog dog1 = new Dog();

    dog1.breed = "corgi";
    dog1.size = 1.0;
    dog1.colorFur = "orange";


  }
}
