public class Apartment {
    private String address;
    private int liveAtHome;
    private int currentWaterMeter;
    private int previousWaterMeter;

    public void updateCurrent(int newCurrent){
        previousWaterMeter = currentWaterMeter;
        currentWaterMeter = newCurrent;
    }
    public double calculatePayment(double rate1, double rate2){
        double finalPrice = 0;
        double sum = liveAtHome * 7;
        finalPrice = (rate1 * (sum) ) + (rate2 * (currentWaterMeter - (sum)));
        return finalPrice;
    }




    public String toString(){
        return "The address is: " + this.address + "\n Live at home: " + liveAtHome +
                "\n The current reading of the water meter: " + this.currentWaterMeter +
                "\n The previous reading of the water meter: " + this.previousWaterMeter;
    }
}
