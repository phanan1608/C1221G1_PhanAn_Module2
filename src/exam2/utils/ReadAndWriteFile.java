package exam2.utils;

import exam2.models.Classroom;
import exam2.models.Student;
import exam2.models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
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

    public static List<Student> readStudentListFromCSV(String filePath) {
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Student student = new Student(
                    Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5])
            );
            studentList.add(student);
        }
        return studentList;
    }

    public static List<Classroom> readClassRoomListFromCSV(String filePath) {
        List<Classroom> classroomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Classroom classroom = new Classroom(
                    Integer.parseInt(arr[0]), arr[1], arr[2]
            );
            classroomList.add(classroom);
        }
        return classroomList;
    }

    public static List<Teacher> readTeacherListFromCSV(String filePath) {
        List<Teacher> teacherList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Teacher teacher = new Teacher(
                    arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4])
//                    fullName, String birthday, String gender, String phoneNumber, int teacherCode
            );
            teacherList.add(teacher);
        }
        return teacherList;
    }

    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
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

    public static void writeListStudentToCSV(String filePath, List<Student> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

}
