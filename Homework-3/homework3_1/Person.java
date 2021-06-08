package homework3_1;

public class Person {
    public String name, address, telephone, email;
    
    public Person() {
        
    }
    
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
}