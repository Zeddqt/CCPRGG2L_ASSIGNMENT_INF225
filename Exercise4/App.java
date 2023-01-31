public class App {
    public static void main(String[] args) throws Exception {
      
      Person friend =  new Person(18,"qwerty");
      Myself Me = new Myself(18,"Carlos");

      Me.addFriend(friend);

      Pet cat = new Pet("dexter", friend);
      cat.showOwnerName();

      Car car = new Car("toyota supra", Me);
      car.showCar();
    }
}
