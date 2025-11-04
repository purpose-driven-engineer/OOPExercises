public class StudentEnrolment {
    // learning encapsulation

    private String name;
    private int studentId;
    private int age;

    public StudentEnrolment(String name, int studentId, int age) {
        setName(name);
        setStudentId(studentId);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("Name field cannot be empty!");
        }
    }

    public void setStudentId(int studentId){
        if (studentId > 0){
            this.studentId = studentId;
        } else {
            System.out.println("Student ID cannot be negative!");
        }
    }

    public void setAge(int age){
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Age is invalid!");
        }
    }


}
