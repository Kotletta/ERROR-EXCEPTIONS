package Entity;

import Enums.EnumGroups;
import Enums.EnumSubjects;

import java.util.List;

public class Group {
    private EnumGroups enumGroup;
    private List<Student> studentList;

    public Group(EnumGroups enumGroup, List<Student> studentList, EnumSubjects [] listSubjects) {
        this.enumGroup = enumGroup;
        this.studentList = studentList;
    }

    public EnumGroups getEnumGroup() {
        return enumGroup;
    }

    public void setEnumGroup(EnumGroups enumGroup) {
        this.enumGroup = enumGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public boolean checkingStudentByGroup ( String name) {
        boolean result = false;
        for (Student student: studentList) {
            if (student.getName().equals(name)) {
                result = true;
            }
        }
        return result;
    }
    public double getAverageGradeStudent (Student name){
        Double average = Double.valueOf(0);
        for (Student student:studentList) {
            if (student.getName().equals(name)){
                average = student.getAverage();
            }
        }
        return average;
    }

    public void checkingGroupHasSubject (EnumSubjects enumSubject){

    }
}
