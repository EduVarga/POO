package person;

public class MainPerson {
    public static void main(String[] args) {
        Person ada = new Person("Ada Loevelace", "24 Maddox...");
        Person javier = new Person("Javier García");
        javier.setAddress("Calle Mayor...");
        System.out.println(ada);
        System.out.println(javier);
    }
}
