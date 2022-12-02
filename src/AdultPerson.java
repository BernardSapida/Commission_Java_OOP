public class AdultPerson {
    String fullName = "John Doe";
    String address = "Rizal Cavite";
    String gender = "Male";
    String contactNumber = "09472126029";
    int age = 70;

    public void displayInformation() {
        System.out.println("Fullname: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
    }

    public void CanDo() {
        System.out.println("What he/she can do... Overwrite this.");
    }
}
