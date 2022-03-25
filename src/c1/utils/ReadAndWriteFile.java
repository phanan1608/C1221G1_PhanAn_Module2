package c1.utils;

import c1.models.NormalPatient;
import c1.models.Record;
import c1.models.VipPatient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Record> readBankAccountFromCSV(String filePath) {
        List<Record> recordList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr;
        for (String string : stringList) {
            arr = string.split(",");
            if (arr.length == 9) {
                VipPatient vipPatient = new VipPatient(
                        Integer.parseInt(arr[0]),
                        arr[1],
                        arr[2],
                        arr[3],
                        arr[4],
                        arr[5],
                        arr[6],
                        arr[7],
                        Integer.parseInt(arr[8])
                );
                recordList.add(vipPatient);

            } else if (arr.length == 8) {
                NormalPatient normalPatient = new NormalPatient(
                        Integer.parseInt(arr[0]),
                        arr[1],
                        arr[2],
                        arr[3],
                        arr[4],
                        arr[5],
                        arr[6],
                        Integer.parseInt(arr[7])
                );
                recordList.add(normalPatient);
            }
        }
        return recordList;
    }

    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        File file = new File(filePath);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListBankAccountToCSV(String filePath, List<Record> recordList) {
        List<String> stringList = new ArrayList<>();
        for (Record record : recordList) {
            stringList.add(record.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }
}
