import java.util.ArrayList;
import java.util.HashMap;


public class SYS {
    static ArrayList<StuSys> students = new ArrayList<StuSys>();
    public static void main(String[] args) {
        StuSys s = new StuSys(19, "oyu", "cef", "ytes", "you@math", "m");
        students.add(s);
         s = new StuSys(0, "oyugbg", "cebgbgf", "ytes", "you@chim", "f");
         students.add(s);
          s = new StuSys(19, "oyfvfvf", "cvfvfef", "ytes", "you@phys", "m");
         students.add(s);
         System.out.println(students);
         System.out.println(getEtudiantsMedian());
         System.out.println(getEtudiantParNom("oyugbg"));
         System.out.println(getDepartement("oyfvfvf"));
        System.out.println(getEtudiantParAgeEtSexe(19, "m"));
    }

    public static HashMap<String, StuSys> getEtudiantsMedian() {
        HashMap<String, StuSys> median = new HashMap<String, StuSys>();
        for (StuSys i : students) {
            if (i.getAge() >= 18 && i.getAge() <= 25) {
                median.put(i.getName(), i);
            }
        }
        return median;
    }

    public static StuSys getEtudiantParNom(String name) {
        for (StuSys stu : students) {
            if (stu.getName() == name) {
                return stu;
            }
        }
        return null;
    }

    public static String getDepartement(String name) {
        return getEtudiantParNom(name).getDep();
    }

    public static ArrayList<StuSys> getEtudiantParAgeEtSexe(int minAge, String sexe) {
        ArrayList<StuSys> spcstudent = new ArrayList<StuSys>();
        for (StuSys i : students) {
            if (i.getAge() == minAge && i.getSex() == sexe) {
                spcstudent.add(i);
            }
        }
        return spcstudent;
    }
}
