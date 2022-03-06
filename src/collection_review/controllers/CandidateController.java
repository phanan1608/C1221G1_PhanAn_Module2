package collection_review.controllers;

import collection_review.models.Candidates;
import collection_review.models.ExperienceCandidate;
import collection_review.models.FresherCandidate;
import collection_review.models.InternCandidate;
import collection_review.services.impl.impl.ExperienceServicesImpl;
import collection_review.services.impl.impl.FresherServicesImpl;
import collection_review.services.impl.impl.InternServicesImpl;

import java.util.Scanner;

public class CandidateController extends EnterInformation {
    public void displayMenu() {
        ExperienceServicesImpl experienceCandidate = new ExperienceServicesImpl();
        FresherServicesImpl fresherCandidate = new FresherServicesImpl();
        InternServicesImpl internCandidate = new InternServicesImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
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

    private void search(ExperienceServicesImpl experienceCandidate, FresherServicesImpl fresherCandidate, InternServicesImpl internCandidate, Scanner scanner) {
        experienceCandidate.displayFullName();
        fresherCandidate.displayFullName();
        internCandidate.displayFullName();
        System.out.println("Input Candidate name (First name or Last name): ");
        String nameSearch = scanner.nextLine();
        int typeCandidateSearch;
        do {
            System.out.println("Input type of candidate:\n" +
                    "0. Experience\n" +
                    "1. Fresher\n" +
                    "2. Intern");
            typeCandidateSearch = Integer.parseInt(scanner.nextLine());
            if (typeCandidateSearch < 0 || typeCandidateSearch > 2) {
                System.err.println("Please only choice 0, 1 or 2");
            } else break;
        } while (true);
        switch (typeCandidateSearch) {
            case 0:
                System.out.println("=====EXPERIENCE LIST===== ");
                experienceCandidate.searchByName(nameSearch);
                break;
            case 1:
                System.out.println("=====FRESHER LIST===== ");
                fresherCandidate.searchByName(nameSearch);
                break;
            case 2:
                System.out.println("=====INTERN LIST===== ");
                internCandidate.searchByName(nameSearch);
                break;
        }
    }

    private void addInternList(InternServicesImpl internCandidate, Scanner scanner) {
        do {
            System.out.println("=====CREATE INTERN=====");
            super.enterInformationCandidate();
            int candidateType = Candidates.INTERN;
            System.out.println("Enter Major");
            String major = scanner.nextLine();
            System.out.println("Enter Semester");
            int semester = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter University Name");
            String universityName = scanner.nextLine();
            InternCandidate intern = new InternCandidate(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType, major, semester, universityName);
            internCandidate.add(intern);
            System.out.println("Successfully Added");
            internCandidate.displayList();
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            if (!"y".equals(choiceAdd.toLowerCase())) {
                break;
            }
        } while (true);
    }

    private void addFresherList(FresherServicesImpl fresherCandidate, Scanner scanner) {
        do {
            System.out.println("=====CREATE FRESHER=====");
            super.enterInformationCandidate();
            int candidateType = Candidates.FRESHER;
            System.out.println("Enter Graduation Date");
            int graduationDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Graduation Rank");
            String graduationRank;
            do {
                graduationRank = scanner.nextLine();
                if (!"excellence".equals(graduationRank.toLowerCase()) && !"good".equals(graduationRank.toLowerCase()) && !"fair".equals(graduationRank.toLowerCase()) && !"poor".equals(graduationRank.toLowerCase())) {
                    System.err.println("Please Re-enter Graduation Rank (Excellence, Good, Fair, Poor)");
                } else break;
            } while (true);
            System.out.println("Enter Education");
            String education = scanner.nextLine();
            FresherCandidate fresher = new FresherCandidate(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType, graduationDate, graduationRank, education);
            fresherCandidate.add(fresher);
            System.out.println("Successfully Added");
            fresherCandidate.displayList();
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            if (!"y".equals(choiceAdd.toLowerCase())) {
                break;
            }
        } while (true);
    }

    private void addExperienceList(ExperienceServicesImpl experienceCandidate, Scanner scanner) {
        do {
            System.out.println("=====CREATE EXPERIENCE=====");
            super.enterInformationCandidate();
            int candidateType = Candidates.EXPERIENCE;
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
            System.out.println("Successfully Added");
            experienceCandidate.displayList();
            System.out.println("Do you want to continue (Y/N)?. ");
            String choiceAdd = scanner.nextLine();
            if (!"y".equals(choiceAdd.toLowerCase())) {
                break;
            }
        } while (true);
    }
}