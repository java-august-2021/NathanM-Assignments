public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        String ringing = getRingTone();
            return ringing;
    }
    @Override
    public String unlock() {
        // your code here
        return "iPhone unlocked";
    }
    @Override
    public void displayInfo() {
        // your code here
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");             
    }
}

