public class Student {

    private int student_id;
    private String student_name;
    private String studentCurriculum;

    //Getters
    public int getStudent_id(){return student_id;}
    public String getStudent_name(){return student_name;}
    public String getStudentCurriculum(){return studentCurriculum;}

    //Setters
    public void setStudent_id(int id)
    {
        this.student_id = id;
    }

    public void setStudent_name(String name)
    {
        this.student_name = name;
    }

    public void setStudentCurriculum(String curriculum)
    {
        this.studentCurriculum = curriculum;
    }

}
