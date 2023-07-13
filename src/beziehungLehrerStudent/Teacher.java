package beziehungLehrerStudent;

import java.util.Arrays;

public class Teacher extends Person{

    public Teacher(String name, int personId, String branche, String[] adress) {
        super(name, personId, branche, adress);
    }

    public void akademik(String ... values){
        System.out.println(Arrays.toString(values));
    }

    @Override
    public String toString() {
        return "Hier ist es information eines Lehreres:\n"+super.toString();
    }
}

