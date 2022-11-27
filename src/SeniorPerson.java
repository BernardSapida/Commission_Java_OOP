public class SeniorPerson extends AdultPerson {
    boolean isSenior = super.age > 65;

    public void canUseSeniorCitizenDiscount() {
        if(isSenior == true) System.out.println(super.fullName + " is using his/her senior citizen discount.");
        else if(isSenior == false) System.out.println(super.fullName + " can't use senior citizen discount.");
    }
}
