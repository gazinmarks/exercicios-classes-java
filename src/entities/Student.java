package entities;

import org.w3c.dom.ls.LSOutput;

public class Student {

    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public Student (String name, double firstNote, double secondNote, double thirdNote){
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
        this.thirdNote = thirdNote;
    }


    public double sumNote() {
        return firstNote + secondNote + thirdNote;
    }

    public String finalNote() {
        double missingPoints;
        missingPoints = 60 - sumNote();
        return System.out.printf("Missing %.2f Points", missingPoints).toString();
    }

}
