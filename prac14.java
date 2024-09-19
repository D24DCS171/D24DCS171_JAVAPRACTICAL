

public class prac14 {
    private int month;
    private int day;
    private int year;

    public prac14(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args) {
        prac14 myDate = new prac14(8, 7, 2024);

        System.out.println("Initial date:");
        myDate.displayDate();

        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2025);

        System.out.println("\nModified date:");
        myDate.displayDate();

        System.out.println("\nAccessing individual components:");
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());
        System.out.println("Year: " + myDate.getYear());
    }
}
