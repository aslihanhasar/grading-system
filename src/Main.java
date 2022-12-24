public class Main {
    public static void main(String[] args) {
        Teacher teacherOne = new Teacher("John", "Stewart", "Mathematics", "MATH");
        Teacher teacherTwo = new Teacher("Kevin", "Hood", "Physics", "PSC");
        Teacher teacherThree = new Teacher("Klara", "Bool", "Chemistry", "CHM");

        Course courseOne = new Course("Mathematics", "MATH", 0.3, teacherOne);
        Course courseTwo = new Course("Physics", "PSC", 0.2, teacherTwo);
        Course courseThree = new Course("Chemistry", "CHM", 0.1, teacherThree);

        Student studentOne = new Student("Carlos", "Sweet", 123, courseOne, courseTwo, courseThree);
        Student studentTwo = new Student("Kylie", "Scott", 475, courseOne, courseTwo, courseThree);
        Student studentThree = new Student("Lisa", "Lenny", 754, courseOne, courseTwo, courseThree);


        System.out.println("*************************************************");
        System.out.println("     The teacher and the course information");
        System.out.println("*************************************************");
        courseOne.addTeacher(teacherOne);
        courseTwo.addTeacher(teacherTwo);
        courseThree.addTeacher(teacherThree);

        studentOne.studentInfo();
        studentOne.addBulkExamNote(100, 80, 20);
        studentOne.addBulkVerbalNote(100, 85, 50);
        studentOne.courseAverages();
        studentOne.totalAverage();
        studentOne.printNote();

        studentTwo.studentInfo();
        studentTwo.addBulkExamNote(50, 80, 40);
        studentTwo.addBulkVerbalNote(60, 90, 60);
        studentTwo.courseAverages();
        studentTwo.totalAverage();
        studentTwo.printNote();

        studentThree.studentInfo();
        studentThree.addBulkExamNote(20, 50, 30);
        studentThree.addBulkVerbalNote(40, 70, 50);
        studentThree.courseAverages();
        studentThree.totalAverage();
        studentThree.printNote();
    }


}
