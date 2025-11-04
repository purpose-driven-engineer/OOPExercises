public class School {
    public static void main(String[] args) {
        StudentEnrolment student1 = new StudentEnrolment("Adams", 10012, 21);
        System.out.println("First student enrolled is " + student1.getName());
        System.out.println(student1.getName() + "' Age is: " + student1.getAge());
        System.out.println(student1.getName() + "'s Student ID is: " + student1.getStudentId());

        // other get methods...etc
        //student1.study();

        StudentEnrolment student2 = new StudentEnrolment("Carol", 1221, 120);
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
        System.out.println(student2.getStudentId());
    }
}
