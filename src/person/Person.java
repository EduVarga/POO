package person;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return this.name + "\n\t" + this.address;
    }

}