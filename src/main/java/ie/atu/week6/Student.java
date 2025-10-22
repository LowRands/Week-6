package ie.atu.week6;
public class Student{
    String name, email, studentID ;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public String getStudentID(){
        return studentID;
    }

    @Override
    public String toString() {
        return "Student(" +
                "name ='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", studentID ='" + studentID + '\'' +
                ')';
    }
}