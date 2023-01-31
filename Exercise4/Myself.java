public class Myself {
    
    int age;
    String name;

    Myself( int myAge, String myName){
        this.age=myAge;
        this.name=myName;
    }

    void addFriend(Person friend){
       System.out.println("I am friends with " + friend.name);
    }
}
