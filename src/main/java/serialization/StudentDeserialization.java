package serialization;

import java.io.*;

public class StudentDeserialization {
    public static void main(String[] args) {

        String filename = "C:\\Users\\DELL\\Desktop\\Interview Prep\\topics\\student.ser";
        Student student = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();
            fis.close();
            ois.close();

        }
        catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        System.out.println(
                student.getName() + " "
                + student.getAge() + " "
                + student.getDepartment() + " "
                + student.getEmail() + " "
                + student.getPassword() + " "
                + student.getUniversity()

        );
    }
}
