package Entity;

import Enums.EnumSubjects;
import java.util.HashMap;
import java.util.Map;
import Exception.LackOfSubjectException;

public class Student {
    private String name;
    private String lastName;
    private HashMap<EnumSubjects, Integer> listGradesBySubjects;

    public Student(String name, String lastName, HashMap<EnumSubjects, Integer> listGrades) {
        this.name = name;
        this.lastName = lastName;
        this.listGradesBySubjects = listGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<EnumSubjects, Integer> getListGradesBySubjects() {
        return listGradesBySubjects;
    }

    public void setListGradesBySubjects(HashMap<EnumSubjects, Integer> listGradesBySubjects) throws LackOfSubjectException {
        if (listGradesBySubjects.isEmpty() || listGradesBySubjects == null){
            throw new LackOfSubjectException();
        }
        this.listGradesBySubjects = listGradesBySubjects;
    }

    public double getAverage(){  //!!!!!!
        double sum = 0;
        for (Map.Entry<EnumSubjects, Integer> entry : listGradesBySubjects.entrySet()) {
            sum += entry.getValue().doubleValue();
        }
        return sum / listGradesBySubjects.size();
    }

    public boolean checkingTheSubjectWithStudent (EnumSubjects enumSubject) {
        boolean result = false;
        for (Map.Entry<EnumSubjects, Integer> entry : listGradesBySubjects.entrySet()){
            if (entry.getKey().equals(enumSubject)){
                return true;
            }
        }
        return result;
    }
    public int getGrade(EnumSubjects enumSubject){
        int grade = 0;
        for (Map.Entry<EnumSubjects, Integer> entry : listGradesBySubjects.entrySet()){
            if (entry.getKey().equals(enumSubject)){
                grade = entry.getValue();
            }
        }
        return grade;
    }
}
