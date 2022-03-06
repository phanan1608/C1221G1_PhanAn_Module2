package collection_review.services.impl.impl;

import collection_review.models.ExperienceCandidate;
import collection_review.services.impl.IServices;

import java.util.ArrayList;
import java.util.List;

public class ExperienceServicesImpl implements IServices<ExperienceCandidate> {
    static List<ExperienceCandidate> experienceList = new ArrayList<>();

    static {
        experienceList.add(new ExperienceCandidate(1001, "Phan", "An", 1997,
                "Da Nang", "0912123123", "abc@gmail.com", 0, 3, "HTMLOL"));
        experienceList.add(new ExperienceCandidate(1023, "Tran", "Hoang", 1997,
                "Da Nang", "0905123312", "xyz@gmail.com", 0, 2, "CSSGO"));
        experienceList.add(new ExperienceCandidate(1023, "Nguyen", "Nghia", 1997,
                "Da Nang", "0905111222", "aaa@gmail.com", 0, 1, "PHPUBG Mobile"));
    }

    @Override
    public void add(ExperienceCandidate experienceCandidate) {
        experienceList.add(experienceCandidate);
    }

    @Override
    public void displayList() {
        System.out.println("=====EXPERIENCE CANDIDATE=====");
        for (ExperienceCandidate candidate : experienceList) {
            System.out.println(candidate);
        }
    }

    @Override
    public void searchByName(String name) {
        List<ExperienceCandidate> listSameName = new ArrayList<>();
        for (ExperienceCandidate candidate : experienceList) {
            String fullName = candidate.getFirstName() + " " + candidate.getLastName();
            if (fullName.toLowerCase().contains(name.toLowerCase()) || candidate.getLastName().toLowerCase().contains(name.toLowerCase()) || candidate.getFirstName().toLowerCase().contains(name.toLowerCase())) {
                listSameName.add(candidate);
            }
        }
        if (listSameName.size() != 0) {
            for (ExperienceCandidate candidate : listSameName) {
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
        System.out.println("=====EXPERIENCE CANDIDATE NAME=====");
        for (ExperienceCandidate candidate : experienceList) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }
}