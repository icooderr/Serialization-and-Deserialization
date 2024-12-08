package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeExternalization {
    public static void main(String[] args) {

        String filename = "C:\\Users\\DELL\\Desktop\\Interview Prep\\topics\\student.ser";
        StudentForExt student = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (StudentForExt) ois.readObject();
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
