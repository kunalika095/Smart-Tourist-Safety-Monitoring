public class User {

    String name;
    String phoneNumber;

    // Constructor
    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Method to display user details
    public void displayUser() {
        System.out.println("Tourist Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        User tourist = new User("Tourist User", "9876543210");
        tourist.displayUser();
    }
}
