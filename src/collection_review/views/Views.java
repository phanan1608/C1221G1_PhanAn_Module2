package collection_review.views;

import collection_review.controllers.CandidateController;

public class Views {
    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController();
        candidateController.displayMenu();
    }
}
