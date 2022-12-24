public class Student {
    Course courseOne;
    Course courseTwo;
    Course courseThree;
    String name;
    String surname;
    int stNumb;
    double average;
    boolean isPass;

    Student(String name, String surname, int stNumb, Course courseOne, Course courseTwo, Course courseThree) {
        this.name = name;
        this.surname = surname;
        this.stNumb = stNumb;
        this.courseOne = courseOne;
        this.courseTwo = courseTwo;
        this.courseThree = courseThree;
    }

    void addBulkExamNote(int noteOne, int noteTwo, int noteThree) {
        if (noteOne >= 0 && noteOne <= 100) {
            this.courseOne.examNote = noteOne;
        }
        if (noteTwo >= 0 && noteTwo <= 100) {
            this.courseTwo.examNote = noteTwo;
        }
        if (noteThree >= 0 && noteThree <= 100) {
            this.courseThree.examNote = noteThree;
        }
    }

    void addBulkVerbalNote(int noteOne, int noteTwo, int noteThree) {
        if (noteOne >= 0 && noteOne <= 100) {
            this.courseOne.verbNote = noteOne;
        }
        if (noteTwo >= 0 && noteTwo <= 100) {
            this.courseTwo.verbNote = noteTwo;
        }
        if (noteThree >= 0 && noteThree <= 100) {
            this.courseThree.verbNote = noteThree;
        }
    }

    void courseAverages() {
        this.courseOne.average = (this.courseOne.examNote * (1 - this.courseOne.effect)) + (this.courseOne.verbNote * this.courseOne.effect);
        this.courseTwo.average = (this.courseTwo.examNote * (1 - this.courseTwo.effect)) + (this.courseTwo.verbNote * this.courseTwo.effect);
        this.courseThree.average = (this.courseThree.examNote * (1 - this.courseThree.effect)) + (this.courseThree.verbNote * this.courseThree.effect);
        System.out.println(this.courseOne.name + " Average: " + this.courseOne.average);
        System.out.println(this.courseTwo.name + " Average: " + this.courseTwo.average);
        System.out.println(this.courseThree.name + " Average: " + this.courseThree.average);
        System.out.println("-------------------------------------------------");
    }

    void totalAverage() {
        this.average = (this.courseOne.average + this.courseTwo.average + this.courseThree.average) / 3;
        if (this.average >= 55) {
            this.isPass = true;
        }
    }

    void printNote() {
        if (this.isPass) {
            System.out.println("Your average: " + this.average + "\nYou have successfully passed the class.");
        } else {
            System.out.println("Your average: " + this.average + "\nYou have failed the class.");
        }
    }

    void studentInfo() {
        System.out.println("*************************************************");
        System.out.println("            The Student Information");
        System.out.println("*************************************************");
        System.out.println(this.name + " " + this.surname + " ( " + this.stNumb + " )");
        System.out.println("-------------------------------------------------");
    }

}
