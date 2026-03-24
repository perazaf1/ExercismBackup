public class CarsAssemble {

    public double productionRatePerHour(int speed) {
    double rate = 221 * speed;

    if (speed <= 4) {
        return rate;
    } else if (speed <= 8) {  // pas besoin de "4 <", car si on arrive ici c'est déjà que speed > 4
        return rate * 0.9;
    } else if (speed == 9) {
        return rate * 0.8;
    } else {
        return rate * 0.77;
    }
}

    public int workingItemsPerMinute(int speed) {
    return (int) (productionRatePerHour(speed)/60);

        
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
