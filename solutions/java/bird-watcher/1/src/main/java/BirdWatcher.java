
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        return birdsPerDay[6];
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }


    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }


    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i<numberOfDays && i<birdsPerDay.length; i++){
            sum += birdsPerDay[i];
        }
        return sum;
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : birdsPerDay){
            if (birds >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
