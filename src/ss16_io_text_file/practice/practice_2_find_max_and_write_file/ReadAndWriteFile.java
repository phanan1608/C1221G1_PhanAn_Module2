package ss16_io_text_file.practice.practice_2_find_max_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("Nhập file input");
        String pathRead = scanner.nextLine();

        List<Integer> numbers = readAndWriteFile.readFile(pathRead);
        int maxValue = findMax(numbers);
        System.out.println("Xuất file output");

        String pathWrite = scanner.nextLine();

        readAndWriteFile.writeFile(pathWrite, maxValue);
    }
}

