public class Apples {
  public static void main(String[] args) {
    Tuna tunaObject = new Tuna("True Tuna");
    Tuna tunaObject2 = new Tuna("Little Tunny");
    Tuna tunaObject3 = new Tuna("Fishy Dishy");
    Tuna tunaObject4 = new Tuna("Fishy Kitty");

    System.out.println(tunaObject.numberOfTuna); //object calling static variable works. 
    System.out.println(Tuna.numberOfTuna); //class calling static variable works

    System.out.println(tunaObject.printNumOfTuna()); //object calling static method works.
    System.out.println(Tuna.printNumOfTuna()); //class calling static method works. 

    System.out.println(tunaObject.printType()); //object calling non-static method works. 
    //System.out.println(Tuna.printType()); //class calling non-static method does not work. 




    
  }
}

