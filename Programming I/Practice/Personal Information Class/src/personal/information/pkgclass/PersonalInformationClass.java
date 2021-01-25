
package personal.information.pkgclass;

public class PersonalInformationClass {


    public static void main(String[] args) {
        Person user = new Person();
        Person userFriend = new Person();
        Person userFriendTwo = new Person();
        
    // User Information        
        user.setName("Jeremy");
        user.setAddress("607 Dawn St");
        user.setAge(18);
        user.setPhone("530-572-0334");
        
        userFriend.setName("Billy");
        userFriend.setAddress("123 Lane St");
        userFriend.setAge(69);
        userFriend.setPhone("530-898-3324");
        
        userFriendTwo.setName("Jill");
        userFriendTwo.setAddress("609 Dawn St");
        userFriendTwo.setAge(18);
        userFriendTwo.setPhone("973-111-6767");
        
    // Displaying Information
        System.out.println("My Information: ");
        System.out.println("Age: " + user.getName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Age: " + user.getAge());
        System.out.println("Phone Number: " + user.getPhone());
        
        System.out.println("\nMy Friend's Information : ");
        System.out.println("Age: " + userFriend.getName());
        System.out.println("Address: " + userFriend.getAddress());
        System.out.println("Age: " + userFriend.getAge());
        System.out.println("Phone Number: " + userFriend.getPhone());
        
        System.out.println("\nMy Other Friend's Information: ");
        System.out.println("Age: " + userFriendTwo.getName());
        System.out.println("Address: " + userFriendTwo.getAddress());
        System.out.println("Age: " + userFriendTwo.getAge());
        System.out.println("Phone Number: " + userFriendTwo.getPhone());
    }
    
}
