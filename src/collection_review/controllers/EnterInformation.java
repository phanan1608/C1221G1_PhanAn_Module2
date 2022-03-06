package collection_review.controllers;

import java.util.Calendar;
import java.util.Scanner;

public class EnterInformation {
    protected int candidateId;
    protected String firstName;
    protected String lastName;
    protected int birthDay;
    protected String address;
    protected String phone;
    protected String email;

    Scanner scanner = new Scanner(System.in);

    Calendar instance = Calendar.getInstance();
    int yearCurrent = instance.get(Calendar.YEAR);

    public static final String EMAIL_FORMAT = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String PHONE_NUMBER_MINIMUM = "\\d{10}";

    public void enterInformationCandidate() {
        System.out.println("Enter Candidate ID");
        candidateId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name");
        lastName = scanner.nextLine();
        System.out.println("Enter Birth Day");
        do {
            birthDay = Integer.parseInt(scanner.nextLine());
            if (birthDay < 1900 || birthDay > yearCurrent) {
                System.err.println("Please Re-enter Birth Day (from 1900 to now)");
            } else break;
        } while (true);
        System.out.println("Enter Address");
        address = scanner.nextLine();
        System.out.println("Enter Phone");
        do {
            phone = scanner.nextLine();
            if (!phone.matches(PHONE_NUMBER_MINIMUM)) {
                System.err.println("Invalid phone number!!!Please Re-enter(minimum 10 characters)");
            } else break;
        } while (true);
        System.out.println("Enter Email");
        do {
            email = scanner.nextLine();
            if (!email.matches(EMAIL_FORMAT)) {
                System.err.println("Invalid email!!!Please Re-enter(accountname>@<domain)");
            } else break;
        } while (true);
    }

}
