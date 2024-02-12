public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int[] getDateArray() {
        return new int[] {month, day, year};
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}