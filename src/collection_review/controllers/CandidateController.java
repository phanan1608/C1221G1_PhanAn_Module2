package collection_review.controllers;

import collection_review.models.ExperienceCandidate;
import collection_review.models.FresherCandidate;
import collection_review.models.InternCandidate;
import collection_review.services.impl.ExperienceCandidateImpl;
import collection_review.services.impl.FresherCandidateImpl;
import collection_review.services.impl.InternCandidateImpl;

import java.util.Calendar;
import java.util.Scanner;

public class CandidateController {
    Calendar instance = Calendar.getInstance();
    int yearCurrent = instance.get(Calendar.YEAR);

    public static final String EMAIL_FORMAT = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String PHONE_NUMBER_MINIMUM = "\\d{10}";

    public void displayMenu() {
        ExperienceCandidateImpl experienceCandidate = new ExperienceCandidateImpl();
        FresherCandidateImpl fresherCandidate = new FresherCandidateImpl();
        InternCandidateImpl internCandidate = new InternCandidateImpl();
        Scanner scanner = new Scanner(System.in);


        int choice = -1;
        do {
            System.out.println("==========CANDIDATE MANAGEMENT SYSTEM==========\n" +
                    "1.\tExperience\n" +
                    "2.\tFresher\n" +
                    "3.\tInternship\n" +
                    "4.\tSearching\n" +
                    "5.\tExit\n" +
                    " (Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, " +
                    "3 to Internship Candidate, 4 to Searching and 5 to Exit program).\n");
            System.out.println("Enter choose");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addExperienceList(experienceCandidate, scanner);
                    break;
                case 2:
                    addFresherList(fresherCandidate, scanner);
                    break;
                case 3:
                    addInternList(internCandidate, scanner);
                    break;
                case 4:
                    search(experienceCandidate, fresherCandidate, internCandidate, scanner);
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        } while (true);

    }

    private void search(ExperienceCandidateImpl experienceCandidate, FresherCandidateImpl fresherCandidate, InternCandidateImpl internCandidate, Scanner scanner) {
        experienceCandidate.displayNameList();
        fresherCandidate.displayNameList();
        internCandidate.displayNameList();
        System.out.println("Input Candidate name (First name or Last name): ");
        String nameSearch = scanner.nextLine();
        System.out.println("Input type of candidate:\n" +
                "1. Experience\n" +
                "2. Fresher\n" +
                "3. Intern");
        int typeCandidateSearch = Integer.parseInt(scanner.nextLine());
        if (typeCandidateSearch == 1) {
            experienceCandidate.searchByName(nameSearch);
        } else if (typeCandidateSearch == 2) {
            fresherCandidate.searchByName(nameSearch);
        } else if (typeCandidateSearch == 3) {
            internCandidate.searchByName(nameSearch);
        } else {
            experienceCandidate.searchByName(nameSearch);
            fresherCandidate.searchByName(nameSearch);
            internCandidate.searchByName(nameSearch);
        }
    }

    private void addInternList(InternCandidateImpl internCandidate, Scanner scanner) {
        internCandidate.displayList();
        boolean flag;
        do {
            System.out.println("=====CREATE INTERN=====");
            System.out.println("Enter Candidate ID");
            int candidateId = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter First Name");
            String firstName = scanner.nextLine();
            System.out.println("Enter Last Name");
            String lastName = scanner.nextLine();
            System.out.println("Enter Birth Day");
            int birthDay;
            do {
                birthDay = Integer.parseInt(scanner.nextLine());
                if (birthDay < 1900 || birthDay > yearCurrent) {
                    System.err.println("Please Re-enter Birth Day (from 1900 to now)");
                } else break;
            } while (true);
            System.out.println("Enter Address");
            String address = scanner.nextLine();
            System.out.println("Enter Phone");
            String phone;
            do {
                phone = scanner.nextLine();
                if (!phone.matches(PHONE_NUMBER_MINIMUM)) {
                    System.err.println("Invalid phone number!!!Please Re-enter(minimum 10 characters)");
                } else break;
            } while (true);
            System.out.println("Enter Email");
            String email;
            do {
                email = scanner.nextLine();
                if (!email.matches(EMAIL_FORMAT)) {
                    System.err.println("Invalid email!!!Please Re-enter(accountname>@<domain)");
                } else break;
            } while (true);
            String candidateType = "Intern";
            System.out.println("Enter Major");
            String major = scanner.nextLine();
            System.out.println("Enter Semester");
            int semester = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter University Name");
            String universityName = scanner.nextLine();
            InternCandidate intern = new InternCandidate(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType, major, semester, universityName);
            internCandidate.add(intern);
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            flag = choiceAdd.toLowerCase().equals("y");
        } while (flag);
    }

    private void addFresherList(FresherCandidateImpl fresherCandidate, Scanner scanner) {
        fresherCandidate.displayList();
        boolean flag;
        do {
            System.out.println("=====CREATE FRESHER=====");
            System.out.println("Enter Candidate ID");
            int candidateId = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter First Name");
            String firstName = scanner.nextLine();
            System.out.println("Enter Last Name");
            String lastName = scanner.nextLine();
            System.out.println("Enter Birth Day");
            int birthDay;
            do {
                birthDay = Integer.parseInt(scanner.nextLine());
                if (birthDay < 1900 || birthDay > yearCurrent) {
                    System.err.println("Please Re-enter Birth Day (from 1900 to now)");
                } else break;
            } while (true);
            System.out.println("Enter Address");
            String address = scanner.nextLine();
            System.out.println("Enter Phone");
            String phone;
            do {
                phone = scanner.nextLine();
                if (!phone.matches(PHONE_NUMBER_MINIMUM)) {
                    System.err.println("Invalid phone number!!!Please Re-enter(minimum 10 characters)");
                } else break;
            } while (true);
            System.out.println("Enter Email");
            String email;
            do {
                email = scanner.nextLine();
                if (!email.matches(EMAIL_FORMAT)) {
                    System.err.println("Invalid email!!!Please Re-enter(accountname>@<domain)");
                } else break;
            } while (true);
            String candidateType = "Fresh";
            System.out.println("Enter Graduation Date");
            int graduationDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Graduation Rank");
            String graduationRank;
            do {
                graduationRank = scanner.nextLine();
                if (!"excellence".equals(graduationRank) && !"good".equals(graduationRank) && !"fair".equals(graduationRank) && !"poor".equals(graduationRank)) {
                    System.err.println("Please Re-enter Graduation Rank (Excellence, Good, Fair, Poor)");
                } else break;

            } while (true);
            System.out.println("Enter Education");
            String education = scanner.nextLine();
            FresherCandidate fresher = new FresherCandidate(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType, graduationDate, graduationRank, education);
            fresherCandidate.add(fresher);
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            flag = choiceAdd.toLowerCase().equals("y");
        } while (flag);
    }

    private void addExperienceList(ExperienceCandidateImpl experienceCandidate, Scanner scanner) {
        experienceCandidate.displayList();
        boolean flag;
        do {
            System.out.println("=====CREATE EXPERIENCE=====");
            System.out.println("Enter Candidate ID");
            int candidateId = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter First Name");
            String firstName = scanner.nextLine();
            System.out.println("Enter Last Name");
            String lastName = scanner.nextLine();
            System.out.println("Enter Birth Day");
            int birthDay;
            do {
                birthDay = Integer.parseInt(scanner.nextLine());
                if (birthDay < 1900 || birthDay > yearCurrent) {
                    System.err.println("Please Re-enter Birth Day (from 1900 to now)");
                } else {
                    break;
                }
            } while (true);
            System.out.println("Enter Address");
            String address = scanner.nextLine();
            System.out.println("Enter Phone");
            String phone;
            do {
                phone = scanner.nextLine();
                if (!phone.matches(PHONE_NUMBER_MINIMUM)) {
                    System.err.println("Invalid phone number!!!Please Re-enter(minimum 10 characters)");
                } else break;
            } while (true);
            System.out.println("Enter Email");
            String email;
            do {
                email = scanner.nextLine();
                if (!email.matches(EMAIL_FORMAT)) {
                    System.err.println("Invalid email!!!Please Re-enter(accountname>@<domain)");
                } else break;
            } while (true);
            String candidateType = "Experience";
            System.out.println("Enter Year Of Experience ");
            int expInYear;
            do {
                expInYear = Integer.parseInt(scanner.nextLine());
                if (expInYear < 0 || expInYear > 100) {
                    System.err.println("Please Re-enter Year Of Experience (from 0 to 100)");
                } else break;
            } while (true);
            System.out.println("Enter Professional Skill ");
            String proSkill = scanner.nextLine();
            ExperienceCandidate experience = new ExperienceCandidate(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType, expInYear, proSkill);
            experienceCandidate.add(experience);
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            flag = choiceAdd.toLowerCase().equals("y");
        } while (flag);
    }
}
