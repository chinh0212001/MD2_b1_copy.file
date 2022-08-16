import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileText {
    public static void main(String[] args){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Students.txt");

            List<Students> studentsList = new ArrayList<>();
            Students students1 = new Students("Chinh",21);
            Students students2 = new Students("Dat",22);
            Students students3 = new Students("Loc", 20);
            studentsList.add(students1);
            studentsList.add(students2);
            studentsList.add(students3);
            for (Students s: studentsList) {
                fileWriter.write(s.writeData());
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileReader fileReader = null;
        List<Students> studentsList = new ArrayList<>();
//        try {
//            fileReader = new FileReader("Students.txt");
//            BufferedReader reader = new BufferedReader(fileReader);
//            String line = null;
//            System.out.println(studentsList.size());
//
//            while (true){
//                line = reader.readLine();
//                if (line == null){
//                    break;
//                }
//                studentsList.add(new Students(line,));
//
//            }
//            for (Students s:studentsList) {
//                System.out.println(s.toString());
//            }
    }
}
