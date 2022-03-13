package ss16_io_text_file.exercise.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisplayCountry {
    public static void main(String[] args) {
        printCountry(readCountryFromCSV("D:\\CodeGym\\project\\module2\\src\\ss16_io_text_file\\exercise\\exercise_2_read_file_csv\\CountryList.txt"));
    }

    public static List<Country> readCountryFromCSV(String pathFile) {
        List<Country> countryList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }

    private static void printCountry(List<Country> country) {
        for (Country element : country) {
            System.out.println(element);
        }
    }
}
