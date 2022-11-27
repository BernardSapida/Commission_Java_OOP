public class Main {
    public static void main(String[] args) throws Exception {
        EmployedPerson employerPerson = new EmployedPerson();
        Toddler toddler = new Toddler();

        System.out.println("\n========================================\n");
        employerPerson.IsWorking();
        System.out.println("\n========================================\n");
        employerPerson.IsResting();
        System.out.println("\n========================================\n");
        employerPerson.canUseSeniorCitizenDiscount();
        System.out.println("\n========================================\n");
        employerPerson.displayInformation();
        System.out.println("\n========================================\n");
        toddler.IsOnTheSchool();
        System.out.println("\n========================================\n");
        toddler.MakingAssign();
        System.out.println("\n========================================\n");
        toddler.IsAtHome();
        System.out.println("\n========================================\n");
    }
}
