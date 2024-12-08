package serialization;

import java.io.*;

public class StudentForExt implements Externalizable {

    @Serial
    private static final long serialVersionUID = 1L;


    private String name;
    private int age;
    private String department;
    private String email;
    private transient String password;
    private static String university;

    public StudentForExt(String name, int age, String department, String email, String password, String university) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
        this.password = password;
        StudentForExt.university = university;
    }

    public StudentForExt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(department);
        out.writeObject(email);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        department = (String) in.readObject();
        email = (String) in.readObject();
    }
}
