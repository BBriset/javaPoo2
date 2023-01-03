public class Hangar {
  
  public static void main(String[] args) {
    Car Clio = new Car("Clio", 120000);
    Boat Titanic  = new Boat("Titanic", 3000);
  
    System.out.println( Clio.doStuff());
    System.out.println( Titanic.doStuff());
  
  }
}
