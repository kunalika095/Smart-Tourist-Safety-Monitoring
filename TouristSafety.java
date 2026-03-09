public class TouristSafety {

    // Method to simulate location tracking
    public static void trackLocation(String location) {
        System.out.println("Tourist current location: " + location);
    }

    // Method to simulate SOS alert
    public static void sendSOS(String touristName, String location) {
        System.out.println("SOS ALERT!");
        System.out.println("Tourist Name: " + touristName);
        System.out.println("Location: " + location);
        System.out.println("Emergency alert sent to nearby police and contacts.");
    }

    // Method to show nearby help centers
    public static void showNearbyHelp() {
        System.out.println("Nearby Help Centers:");
        System.out.println("1. Police Station");
        System.out.println("2. Government Hospital");
        System.out.println("3. Tourist Help Center");
    }

    public static void main(String[] args) {

        String touristName = "Tourist User";
        String location = "Chennai, India";

        System.out.println("Smart Tourist Safety Monitoring System");

        // Track location
        trackLocation(location);

        // Show nearby help
        showNearbyHelp();

        // Simulate emergency
        sendSOS(touristName, location);
    }
}
