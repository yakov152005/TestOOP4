public class ApartmentProgram {
    public static void main(String[] args) {

    }
    public static Apartment[] higherThanAverage(Apartment[] apartments, int liveAtHome, double rate1, double rate2){
        int countForNewApartmentArr = 0;
        double higherThanAvg = 0;
        double sum = 0;
        for (int i = 0; i < apartments.length; i++) {
            sum += apartments[i].calculatePayment(rate1,rate2);
        }
        higherThanAvg = (sum / apartments.length);

        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].calculatePayment(rate1,rate2) > higherThanAvg){
                countForNewApartmentArr++;
            }
        }

        Apartment[] newApartments = new Apartment[countForNewApartmentArr];
        int indexForNewApartments = 0;
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].calculatePayment(rate1,rate2) > higherThanAvg) {
                newApartments[indexForNewApartments++] = apartments[i];
            }
        }
        return newApartments;
    }
}
