public class App {
    public static void main(String[] args) throws Exception {
        
                Person Me = new Person();
        
                // The name property cannot be accessed outside of the Person class.
                // Me.name;
        
                Me.setName("Thirdy");
        
                String myName = Me.getName();
        
                System.out.println("My name is " + myName);
               

                Me.setCCnumber(34521);

                int myCCnumber = Me.getCCnumber();

                System.out.println("My cc number is " +  myCCnumber);


                Son me = new Son();

                System.out .println("My family name is " + me.surname);

                me.showLove();
            }
        }
