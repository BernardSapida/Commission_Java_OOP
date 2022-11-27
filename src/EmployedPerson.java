public class EmployedPerson extends SeniorPerson {
    String dept = "IT Department";
    String post = "Post description";
    int empID = 202201319;
    int rate = 10;
    int salary = 20000;

    public void IsWorking() {
        System.out.println(super.fullName + " employee id was " + empID + " and he/she is working at " + dept + "!");
        System.out.println(super.fullName + " posts a " + post);
        System.out.println("His salary is " + salary + " with a rate of " + rate);
    }

    public void IsResting() {
        System.out.println(super.fullName + " is resting!");
    }
}