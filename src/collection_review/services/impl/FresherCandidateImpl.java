package collection_review.services.impl;

import collection_review.models.FresherCandidate;

import java.util.ArrayList;
import java.util.List;

public class FresherCandidateImpl {
    static List<FresherCandidate> fresherList = new ArrayList<>();

    static {
        fresherList.add(new FresherCandidate(2002, "Nguyễn", "Nghĩa", 1997, "Đà Nẵng", "0900111222", "ấđâsđa@gmail.com", "Fresher", 2018, "Good", "University"));
    }

    public void add(FresherCandidate fresherCandidate) {
        fresherList.add(fresherCandidate);
    }

    public void displayList() {
        System.out.println("=====FRESHER CANDIDATE=====");
        for (FresherCandidate candidate : fresherList) {
            System.out.println(candidate);
        }
    }

    public void displayNameList() {
        System.out.println("=====FRESHER CANDIDATE NAME=====");
        for (FresherCandidate candidate : fresherList) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void searchByName(String name) {
        List<FresherCandidate> listSameName = new ArrayList<>();
        for (FresherCandidate candidate : fresherList) {
            if (candidate.getLastName().toLowerCase().contains(name.toLowerCase()) || candidate.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                listSameName.add(candidate);
            }
        }
        for (FresherCandidate candidate : listSameName) {
            System.out.println("Candidate name: " + candidate.getFirstName() + " " + candidate.getLastName() +
                    ", Birth Date: " + candidate.getBirthDay() +
                    ", Address: " + candidate.getAddress() +
                    ", Phone: " + candidate.getPhone() +
                    ", Email: " + candidate.getEmail() +
                    ", Candidate type: " + candidate.getCandidateType());
        }
    }
}
