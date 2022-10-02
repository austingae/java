public class Main {
  public static void main(String[] args) {
    Tuna tunaObject = new Tuna();
    tunaObject.print();
    System.out.println(tunaObject.food);

    Cake cakeObject = new Cake();
    cakeObject.print();
  }
}

/*
Inheritance:
One class uses the keyword "extends" to inherit all the methods from another class.
In this case, Tuna Class and Cake Class both use the keyword "extends" to inherit all the methods from Food Class.
However, Cake Class has a print() method that overrides Food Class print() method.
*/