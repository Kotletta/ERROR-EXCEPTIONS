package Entity;

import Enums.EnumFaculty;
import Enums.EnumGroups;

import java.util.List;

public class Faculty {
    private EnumFaculty enumFaculty;
    private List<Group> groupList;

    public Faculty(EnumFaculty enumFaculty, List<Group> groupList) {
        this.enumFaculty = enumFaculty;  // add Exceptions
        this.groupList = groupList;
    }

    public EnumFaculty getEnumFaculty() {
        return enumFaculty;
    }

    public void setEnumFaculty(EnumFaculty enumFaculty) {
        this.enumFaculty = enumFaculty;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public boolean CheckingFacultyGetGroup (EnumGroups enumGroups) {
        boolean getGroup = false;
        for (Group g:groupList) {
            if (g.getEnumGroup().equals(enumGroups)){
                getGroup = true;
            }
        }
        return getGroup;
    }
    public int getNumberGroupByName (EnumGroups enumGroups){
        int numberGroup = -1;
        for (Group g : groupList) {
            if (g.getEnumGroup().equals(enumGroups)){
                numberGroup = groupList.indexOf(g);
            }
        }
        return numberGroup;
    }
}
