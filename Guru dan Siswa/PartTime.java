public class PartTime extends Teacher {
    protected int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    

    public PartTime() {
        super();
        hoursworked = 0;
    }

    public PartTime(String name, int age, String subject, int hoursworked) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
    }

    public int setSalary(int hoursworked) {
        int salary = hoursworked * 100000;
        return salary;
    }

    public void print() {
        super.print();
        System.out.println("Hours Worked : " + hoursworked);
        System.out.println("Salary : " + setSalary(hoursworked));
    }
}