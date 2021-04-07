public class Main {

    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        //Assign attributes to student 1
        student1.setStudent_id(2021000001);
        student1.setStudent_name("Jason Balete");
        student1.setStudentCurriculum("Computer Engineering");

        //Assign attributes to student 2
        student2.setStudent_id(2021000001);
        student2.setStudent_name("Jose Rizal");
        student2.setStudentCurriculum("Literature");

        //Assign attributes to student 3
        student3.setStudent_id(2021000001);
        student3.setStudent_name("Andres Bonifacio");
        student3.setStudentCurriculum("Criminology");

        System.out.println("Student 1: " + student1.getStudent_name() + "\nID No: " + student1.getStudent_id() + "\nCurriculum: " + student1.getStudentCurriculum() + "\n");
        System.out.println("Student 2: " + student2.getStudent_name() + "\nID No: " + student2.getStudent_id() + "\nCurriculum: " + student2.getStudentCurriculum() + "\n");
        System.out.println("Student 3: " + student3.getStudent_name() + "\nID No: " + student3.getStudent_id() + "\nCurriculum: " + student3.getStudentCurriculum() + "\n");

    }
}
