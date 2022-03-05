package collection_review.services.impl;

import collection_review.models.ExperienceCandidate;

import java.util.ArrayList;
import java.util.List;

public class ExperienceCandidateImpl {
    static List<ExperienceCandidate> experienceList = new ArrayList<>();

    static {
        experienceList.add(new ExperienceCandidate(1001, "Phan", "An", 1997,
                "Đà Nẵng", "0912123123", "abc@gmail.com", "Experience", 3, "C"));
        experienceList.add(new ExperienceCandidate(1023, "Trần", "Hoàng", 1997,
                "Đà Nẵng", "0905123312", "xyz@gmail.com", "Experience", 3, "D"));
    }

    public void displayList() {
        System.out.println("=====EXPERIENCE CANDIDATE=====");
        for (ExperienceCandidate candidate : experienceList) {
            System.out.println(candidate);
        }
    }

    public void add(ExperienceCandidate experienceCandidate) {
        experienceList.add(experienceCandidate);
    }

    public void displayNameList() {
        System.out.println("=====EXPERIENCE CANDIDATE NAME=====");
        for (ExperienceCandidate candidate : experienceList) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void searchByName(String name) {
        List<ExperienceCandidate> listSameName = new ArrayList<>();
        for (ExperienceCandidate candidate : experienceList) {
            if (candidate.getLastName().toLowerCase().contains(name.toLowerCase()) || candidate.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                listSameName.add(candidate);
            }
        }
        for (ExperienceCandidate candidate : listSameName) {
            System.out.println("Candidate name: " + candidate.getFirstName() + " " + candidate.getLastName() +
                    ", Birth Date: " + candidate.getBirthDay() +
                    ", Address: " + candidate.getAddress() +
                    ", Phone: " + candidate.getPhone() +
                    ", Email: " + candidate.getEmail() +
                    ", Candidate type: " + candidate.getCandidateType());
        }
    }
}
