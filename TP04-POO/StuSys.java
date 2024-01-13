import java.util.*;
public class StuSys {
    private int age;
    private String  Name,firstName, matricule, email,departement;  
    private String sex;
    HashMap<String, String> domanddep = new HashMap<String, String>() {
        {
            put("info", "informatiq");
            put("chim", "chimic");
            put("math", "nathi");
            put("phys", "physics");

        }
    };

    public StuSys(int age, String Name, String firstName, String matricule, String email,
            String sex) {
        this.age = age;
        this.Name = Name;
        this.firstName = firstName;
        this.matricule = matricule;
        this.email = email;
        
        this.sex = sex;
        getDep(email);


    }

    public int getAge() {
        return this.age;
    }

    public String getName()
    {
        return this.Name;
    }

    public String getSex() {
        return this.sex;
    }

    public String getDep() {
        return this.departement;
    }
    
    private void getDep(String email) {
        String[] x = email.split("@");
        String a = x[1];
        departement = domanddep.get(a);
    }
}
