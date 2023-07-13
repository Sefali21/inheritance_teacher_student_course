package beziehungLehrerStudent;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private int personId;
    private String branche;
    private String[] adress= new ArrayList<>().toArray(new String[0]);

    public Person(String name, int personId, String branche, String [] adress){
        this.name=name;
        this.personId=personId;
        this.branche=branche;
        this.adress=adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String[] getAdress() {
        return adress;
    }

    public void setAdress(String[] adress) {
        this.adress = adress;
    }
    public String toString(){
        return "name: "+name+" person ID: "+personId+" branche: "+branche+" adress:" + Arrays.toString(adress);
    }
}

