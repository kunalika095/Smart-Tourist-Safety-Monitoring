public class LocationTracker {

    // Method to simulate getting tourist location
    public static String getLocation() {
        String location = "Chennai, India";
        return location;
    }

    // Method to display tourist location
    public static void displayLocation() {
        String location = getLocation();
        System.out.println("Tracking Tourist Location...");
        System.out.println("Current Location: " + location);
    }

    public static void main(String[] args) {
        displayLocation();
    }
}
