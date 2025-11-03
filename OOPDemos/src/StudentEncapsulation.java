public class StudentEncapsulation {
    // learning encapsulation

    private String name;
    private int studentId;
    private int age;

    public StudentEncapsulation(String name, int studentId, int age) {
        setName(name);
        setStudentId(studentId);
        //setAge(age);
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
        if (this.name != null && !this.name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("Name field cannot be empty!");
        }
    }

    public void setStudentId(int studentId){
        if (this.studentId > 0){
            this.studentId = studentId;
        } else {
            System.out.println("Student ID cannot be negative!");
        }
    }


}
