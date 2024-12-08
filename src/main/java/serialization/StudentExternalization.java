package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentExternalization {
    public static void main(String[] args){

        StudentForExt student = new StudentForExt(
                "Testname",
                20,
                "Bio",
                "test.email@uni.com",
                "testpassword",
                "Java University"
        );


        String filename = "C:\\Users\\DELL\\Desktop\\Interview Prep\\topics\\student.ser";

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            fos.close();
            oos.close();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        System.out.println("Object serialized successfully");
    }
}
