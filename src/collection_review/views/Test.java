package collection_review.views;

public class Test {
    public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    public static void main(String[] args) {
        String yearPattern = "\\d{10}";
        String a = "0905984497";
        boolean b = a.matches(yearPattern);
        System.out.println(b);

//
//        String email1 = "user@domain.com";
//        Boolean b = email1.matches(EMAIL_PATTERN);
//        System.out.println(b);

    }
}
