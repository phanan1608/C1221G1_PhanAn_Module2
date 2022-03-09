package ss16_io_text_file.exercise.exercise_1_copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file input");
        String fileInput = scanner.nextLine();
        List<String> inputString = null;
        String content = null;
        try {
            inputString = readFile(fileInput);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (inputString != null) {
            content = getContent(inputString);
            System.out.println("trong chuỗi có : " + content.length() + " kí tự");
        }
        System.out.println("Enter file output");
        String fileOutput = scanner.nextLine();
        writeFile(fileOutput, inputString);
        System.out.println("kết thúc chương trình");
    }

    public static List<String> readFile(String sourceFile) throws FileNotFoundException {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }


    public static void writeFile(String targetFile, List<String> stringList) {
        File file = new File(targetFile);
        if (file.exists()) {
            System.err.println("File is already exist!");
            return;
        }
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContent(List<String> stringList) {
        String result = "";
        for (String content : stringList) {
            result += content;
        }
        return result;
    }
}
