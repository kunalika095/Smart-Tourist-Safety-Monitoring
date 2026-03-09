public class SOSAlert {

    // Method to send SOS alert
    public static void sendAlert(String touristName, String location) {
        System.out.println("----- EMERGENCY SOS ALERT -----");
        System.out.println("Tourist Name: " + touristName);
        System.out.println("Current Location: " + location);
        System.out.println("Alert sent to nearby police station and emergency contacts.");
    }

    public static void main(String[] args) {
        String touristName = "Tourist User";
        String location = "Chennai, India";

        sendAlert(touristName, location);
    }
}
