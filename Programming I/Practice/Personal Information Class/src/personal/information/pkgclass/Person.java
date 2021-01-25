package personal.information.pkgclass;


public class Person {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public Person() {
        name = "";
        address = "";
        age = 0;
        phoneNumber = "";
    }

    
    public void setName(String myName) {
        name = myName;
    }
    
    public void setAddress(String myAddress) {
        address = myAddress;
    }
    
    public void setAge(int myAge) {
        age = myAge;
    }
    
    public void setPhone(String myPhone) {
        phoneNumber = myPhone;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getPhone() {
        return phoneNumber;
    }
}