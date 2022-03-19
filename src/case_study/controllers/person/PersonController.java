package case_study.controllers.person;

import case_study.utils.Validate;

import java.util.Scanner;

public class PersonController {
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
        System.out.print("Enter Full Name: ");
        return Validate.regexFullName(scanner.nextLine(),
                "Invalid full name. Please Re-enter(Upper first letter- You can input Vietnamese unicode)!!!");
    }

    protected String getDayOfBirthFromInput() {
        System.out.print("Enter Day Of Birth: ");
        return Validate.regexAge18to100(scanner.nextLine());
    }

    protected String getGenderFromInput() {
        System.out.print("Enter Gender: ");
        return Validate.regexGender(scanner.nextLine(),
                "Invalid Gender. Please Re-enter(Please input letter!!!");
    }

    protected String getIdentityCardFromInput() {
        System.out.print("Enter Identity Card: ");
        return Validate.regexIdentityCard(scanner.nextLine(),
                "Invalid Identity Card. Please Re-enter(Please input number(9 or 12 character)!!!");
    }

    protected String getTelephoneNumberFromInput() {
        System.out.print("Enter Telephone Number: ");
        return Validate.regexTelephoneNumber(scanner.nextLine(),
                "Invalid Telephone Number. Please Re-enter(Please input number(10 character and start with 0 or 1)!!!");
    }

    protected String getEmailAddressFromInput() {
        System.out.print("Enter Email Address: ");
        return Validate.regexEmailAddress(scanner.nextLine(),
                "Invalid Email Address. Please Re-enter(user@domain. Example: abc@gmail.com) !!!");
    }
}
