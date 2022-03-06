package collection_review.services.impl;

import collection_review.models.InternCandidate;

import java.util.ArrayList;
import java.util.List;

public class InternCandidateImpl {
    static List<InternCandidate> internList = new ArrayList<>();

    static {
        internList.add(new InternCandidate(3001, "Phan", "Phan", 2000, "Da Nang", "0905168168", "ddmjs@gmail.com", 2, "Marketing", 6, "Economic"));
    }

    public void add(InternCandidate internCandidate) {
        internList.add(internCandidate);
    }

    public void displayList() {
        System.out.println("=====INTERN CANDIDATE=====");
        for (InternCandidate candidate : internList) {
            System.out.println(candidate);
        }
    }

    public void displayNameList() {
        System.out.println("=====INTERN CANDIDATE NAME=====");
        for (InternCandidate candidate : internList) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void searchByName(String name) {
        List<InternCandidate> listSameName = new ArrayList<>();
        for (InternCandidate candidate : internList) {
            if (candidate.getLastName().toLowerCase().contains(name.toLowerCase()) || candidate.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                listSameName.add(candidate);
            }
        }
        for (InternCandidate candidate : listSameName) {
            System.out.println("Candidate name: " + candidate.getFirstName() + " " + candidate.getLastName() +
                    ", Birth Date: " + candidate.getBirthDay() +
                    ", Address: " + candidate.getAddress() +
                    ", Phone: " + candidate.getPhone() +
                    ", Email: " + candidate.getEmail() +
                    ", Candidate type: " + candidate.getCandidateType());
        }
    }
}
