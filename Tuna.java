import java.util.Random;

public class Tuna {
  private String type;
  public int count = 0;

  public static int numberOfTuna = 0;

  public Tuna(String type) {
    this.type = type;

    Random rand = new Random();
    int int_random = rand.nextInt(25);
    count += int_random;

    numberOfTuna = numberOfTuna + 1;
  }

  public String printType() {
    return type;
  }

  public static int printNumOfTuna() {
    return numberOfTuna;
  }

  /*
  A static variable or method accessible by the class (and objects as well if you want).
  A static variable will be shared by all the objects of the same class.
  A static method will only return a static variable. 
  */

}

/*
Access Modifier:
public - this keyword allows other classes to use that variable or function.
private - this keyword does not allow other classes to use that variable or function. Only the class that has that private variable or function can use it. 

If you want to initialize variable(s) as soon as you create your object, you have
to create a constructor. 
*/