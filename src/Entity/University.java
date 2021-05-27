package Entity;

import Enums.EnumFaculty;
import Enums.EnumGroups;
import Enums.EnumSubjects;

import java.util.ArrayList;
import java.util.List;

import static Entity.StringConstants.*;

public class University {

    private List<Faculty> facultyList = new ArrayList<Faculty>();

    public University(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
    public void addFacultyInUniversity (ArrayList<Faculty> universityList){
        this.facultyList = universityList;
    }
    public void averageGradeInAllSubjectsOfTheStudent (String nameStudent) {
        for (Faculty faculty : facultyList) {
            for (Group group: faculty.getGroupList()) {
                if (group.checkingStudentByGroup(nameStudent)){
                    System.out.println(AVERAGE_GRADE_IN_ALL_SUBJECTS + nameStudent + IS
                            + group.getAverageGradeStudent(nameStudent) + GROUP + group.getEnumGroup());
                }
            }
        }
    }
    public int getNumberFacultyByName (EnumFaculty enumFaculty) {
        int numberFaculty = -1;
        for (Faculty f : facultyList) {
            if (f.getEnumFaculty().equals(enumFaculty)){
                numberFaculty = facultyList.indexOf(f);
            }
        }
        return numberFaculty;
    }
    public void averageGradeInSpecificsSubjectGroupFaculty (EnumSubjects enumSubjects, EnumGroups enumGroups, EnumFaculty enumFaculty){
        double sumGradesBySubjects = 0;
        double average = 0;
        int numberFaculty = getNumberFacultyByName(enumFaculty);
        if (numberFaculty >= 0){
            Faculty facultyName = facultyList.get(numberFaculty);
            int numberGroup = facultyName.getNumberGroupByName(enumGroups);
            if (numberGroup >= 0) {
                Group groupByName = facultyName.getGroupList().get(numberGroup);
                for (Student s: groupByName.getStudentList()) {
                    if (s.checkingTheSubjectWithStudent(enumSubjects)){
                        sumGradesBySubjects += s.getGrade(enumSubjects);
                    }
                }
                average = sumGradesBySubjects / groupByName.getStudentList().size();
            }
        }
        System.out.println("Средний баал по " + enumSubjects + " в группе " + enumGroups + " на факультете " + enumFaculty + " равен " + average);
    }
}

