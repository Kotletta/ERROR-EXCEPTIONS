import Entity.Faculty;
import Entity.Group;
import Entity.Student;
import Entity.University;
import Enums.EnumFaculty;
import Enums.EnumGroups;
import Enums.EnumSubjects;




import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static Enums.EnumSubjects.*;

public class Runner {
    private static List<Student> studentsJUR41 = Arrays.asList(
            new Student("Илья", "Сперанский", new HashMap<EnumSubjects, Integer>() {{
            put(MATHS, 9);
            put(GYM, 10);
            put(ENGLISH, 5);
            }}),
            new Student("Ольга", "Тихонова", new HashMap<EnumSubjects, Integer>() {{
                put(GYM, 8);
                put(ENGLISH, 10);
            }}),
            new Student("Антон", "Прозоров", new HashMap<EnumSubjects, Integer>() {{
                put(GYM, 10);
            }})
    );;

    private static List<Student> studentsSPO11 = Arrays.asList(
            new Student("Михаил", "Понамарев", new HashMap<EnumSubjects, Integer>() {{
                put(HISTORY, 3);
                put(BIOLOGY, 5);
                put(CHEMISTRY, 10);
            }}),
            new Student("Антон", "Антипов", new HashMap<EnumSubjects, Integer>() {{
                put(GYM, 10);
                put(BIOLOGY, 9);
                put(CHEMISTRY, 4);
            }})
    );
    private static List<Student> studentsECO21 = Arrays.asList(

    );
    private static List<Student> studentsSPO41 = Arrays.asList(
            new Student("Сергей", "Макеев", new HashMap<EnumSubjects, Integer>() {{
                put(PHILOSOPHY, 10);
                put(GYM, 10);
                put(ENGLISH, 10);
            }}),
            new Student("Светлана", "Терещенко", new HashMap<EnumSubjects, Integer>() {{
            }})
    );
    //----------------------------
    private static List<Group> groupSPO = Arrays.asList(
            new Group(EnumGroups.SPO11,studentsSPO11, new EnumSubjects[]{HISTORY, BIOLOGY,CHEMISTRY}),
            new Group(EnumGroups.SPO41,studentsSPO41, new EnumSubjects[]{PHILOSOPHY,GYM,ENGLISH})
    );;
    private static List<Group> groupJUR = Arrays.asList(
            new Group(EnumGroups.JUR41,studentsJUR41, new EnumSubjects[]{MATHS, GYM,ENGLISH}),
            new Group(EnumGroups.ECO21,studentsECO21, new EnumSubjects[]{MATHS, GYM,ENGLISH})
    );;
    private static List<Group> groupECO = Arrays.asList(

    );;
    //----------------------------
    private static List<Faculty> facultyList = Arrays.asList(
            new Faculty(EnumFaculty.ECONOMIC, groupECO),
            new Faculty(EnumFaculty.JURIDICAL, groupJUR),
            new Faculty(EnumFaculty.SPORTING, groupSPO)
    );

    public static void main(String[] args) {
        University university = new University(facultyList);

        university.averageGradeInAllSubjectsOfTheStudent("Ольга");
        university.averageGradeInSpecificsSubjectGroupFaculty(GYM, EnumGroups.JUR41, EnumFaculty.JURIDICAL);
        university.averageGradeInSubjectForTheWholeUniversity(ENGLISH);
    }

}
