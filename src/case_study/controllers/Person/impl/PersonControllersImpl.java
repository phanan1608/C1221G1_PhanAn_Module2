package case_study.controllers.Person.impl;

import case_study.utils.Validate;

import java.util.Scanner;

public class PersonControllersImpl {
    protected String fullName;
    protected String dayOfBirth;
    protected String gender;
    protected String identityCard;
    protected String telephoneNumber;
    protected String emailAddress;

    Scanner scanner = new Scanner(System.in);

    protected void inputPersonInformationBasic() {
        fullName = getFullNameFromInput();
        dayOfBirth = getDayOfBirthFromInput();
        gender = getGenderFromInput();
        identityCard = getIdentityCardFromInput();
        telephoneNumber = getTelephoneNumberFromInput();
        emailAddress = getEmailAddressFromInput();
    }

    protected String getFullNameFromInput() {
        String fullName;
        do {
            System.out.println("Enter Full Name");
            fullName = scanner.nextLine();
            if (!Validate.isFullName(fullName)) {
                System.out.println("Invalid full name. Please Re-enter(Upper first letter- You can input Vietnamese unicode)!!!");
            } else break;
        } while (true);
        return fullName;
    }

    protected String getDayOfBirthFromInput() {
        String dayOfBirth;
        do {
            System.out.println("Enter Day Of Birth");
            dayOfBirth = scanner.nextLine();
            if (!Validate.isDayOfBirth(dayOfBirth)) {
                System.out.println("Invalid Day Of Birth. Please Re-enter(dd/mm/yyyy)");
            } else break;
        } while (true);
        return dayOfBirth;
    }

    protected String getGenderFromInput() {
        String gender;
        do {
            System.out.println("Enter Gender");
            gender = scanner.nextLine();
            if (!Validate.isGender(gender.toLowerCase())) {
                System.out.println("Invalid Gender. Please Re-enter(Please input letter!!!");
            } else break;
        } while (true);
        return gender;
    }

    protected String getIdentityCardFromInput() {
        String identityCard;
        do {
            System.out.println("Enter Identity Card");
            identityCard = scanner.nextLine();
            if (!Validate.isIdentityCard(identityCard)) {
                System.out.println("Invalid Identity Card. Please Re-enter(Please input number(9 or 12 character)!!!");
            } else break;
        } while (true);
        return identityCard;
    }

    protected String getTelephoneNumberFromInput() {
        String telephoneNumber;
        do {
            System.out.println("Enter Telephone Number");
            telephoneNumber = scanner.nextLine();
            if (!Validate.isTelephoneNumber(telephoneNumber)) {
                System.out.println("Invalid Telephone Number. Please Re-enter(Please input number(10 character)!!!");
            } else break;
        } while (true);
        return telephoneNumber;
    }

    protected String getEmailAddressFromInput() {
        String emailAddress;
        do {
            System.out.println("Enter Email Address");
            emailAddress = scanner.nextLine();
            if (!Validate.isEmailAddress(emailAddress)) {
                System.out.println("Invalid Email Address. Please Re-enter(user@domain. Example: abc@gmail.com) !!!");
            } else break;
        } while (true);
        return emailAddress;
    }
}
