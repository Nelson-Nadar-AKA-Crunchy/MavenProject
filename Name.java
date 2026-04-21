public class Name {
    public static void main(String[] args) {

        String firstName = System.getenv("Firstname");
        String lastName = System.getenv("Lastname");

        if (firstName == null || lastName == null) {
            System.out.println("Firstname or Lastname parameter is missing");
        } else {
            System.out.println("Firstname: " + firstName);
            System.out.println("Lastname: " + lastName);
        }
    }
}
