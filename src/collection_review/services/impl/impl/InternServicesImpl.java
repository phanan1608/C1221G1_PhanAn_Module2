package collection_review.services.impl.impl;

import collection_review.models.InternCandidate;
import collection_review.services.impl.IServices;

import java.util.ArrayList;
import java.util.List;

public class InternServicesImpl implements IServices<InternCandidate> {
    static List<InternCandidate> internList = new ArrayList<>();

    static {
        internList.add(new InternCandidate(3001, "Phan", "Phan", 2000, "Da Nang", "0905168168", "ddmjs@gmail.com", 2, "Marketing", 6, "Economic"));
    }

    @Override
    public void add(InternCandidate internCandidate) {
        internList.add(internCandidate);
    }

    @Override
    public void displayList() {
        System.out.println("=====INTERN CANDIDATE=====");
        for (InternCandidate candidate : internList) {
            System.out.println(candidate);
        }
    }

    @Override
    public void searchByName(String name) {
        List<InternCandidate> listSameName = new ArrayList<>();
        for (InternCandidate candidate : internList) {
            String fullName = candidate.getFirstName() + " " + candidate.getLastName();
            if (fullName.toLowerCase().contains(name.toLowerCase()) || candidate.getLastName().toLowerCase().contains(name.toLowerCase()) || candidate.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                listSameName.add(candidate);
            }
        }
        if (listSameName.size() != 0) {
            for (InternCandidate candidate : listSameName) {
                System.out.println("Candidate name: " + candidate.getFirstName() + " " + candidate.getLastName() +
                        ", Birth Date: " + candidate.getBirthDay() +
                        ", Address: " + candidate.getAddress() +
                        ", Phone: " + candidate.getPhone() +
                        ", Email: " + candidate.getEmail() +
                        ", Candidate type: " + candidate.getCandidateType());
            }
        } else {
            System.out.println("NOT FOUND");
        }
    }

    @Override
    public void displayFullName() {
        System.out.println("=====INTERN CANDIDATE NAME=====");
        for (InternCandidate candidate : internList) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }
}