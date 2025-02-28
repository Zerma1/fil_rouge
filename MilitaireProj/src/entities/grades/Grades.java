// GradesMethode.java
package entities.grades;

public class Grades<T> {
    private T grade;

    public Grades(T grade) {
        this.grade = grade;
    }

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }

    public void displayGrade() {
        System.out.println("Grade: " + grade.toString());
    }
}