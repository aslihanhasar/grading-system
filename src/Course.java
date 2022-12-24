public class Course {
    Teacher teacher;
    String name;
    String prefix;
    double effect;
    int verbNote;
    int examNote;
    double average;

    Course(String name, String prefix, double effect, Teacher teacher) {
        this.name = name;
        this.prefix = prefix;
        this.teacher = teacher;
        this.effect = effect;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.match.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo(this.teacher);
        } else {
            System.out.println("The course and the teacher do not match.");
        }
    }

    void printTeacherInfo(Teacher teacher) {
        System.out.println(teacher.name + " " + teacher.surname + " " + " : " + this.name);
    }

}
