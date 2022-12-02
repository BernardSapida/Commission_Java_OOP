public class Main {
    public static void main(String[] args) throws Exception {
        AdultPerson adultPerson = new AdultPerson();
        SeniorPerson seniorPerson = new SeniorPerson();
        EmployedPerson employerPerson = new EmployedPerson();
        Toddler toddler = new Toddler();

        System.out.println("\n========================================\n");
        adultPerson.CanDo();
        System.out.println("\n========================================\n");
        seniorPerson.canUseSeniorCitizenDiscount();
        System.out.println("\n========================================\n");
        seniorPerson.CanDo();
        System.out.println("\n========================================\n");
        employerPerson.IsWorking();
        System.out.println("\n========================================\n");
        employerPerson.IsResting();
        System.out.println("\n========================================\n");
        employerPerson.displayInformation();
        System.out.println("\n========================================\n");
        employerPerson.CanDo();
        System.out.println("\n========================================\n");
        toddler.IsOnTheSchool();
        System.out.println("\n========================================\n");
        toddler.MakingAssign();
        System.out.println("\n========================================\n");
        toddler.IsAtHome();
        System.out.println("\n========================================\n");
        toddler.CanDo();
        System.out.println("\n========================================\n");
    }
}
