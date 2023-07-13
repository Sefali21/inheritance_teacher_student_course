package beziehungLehrerStudent;

public class Student extends Person{

    private double credit;
    public Student(String name, int personId, String branche, String[] adress, double credit) {
        super(name, personId, branche, adress);
        this.credit=credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Hier ist es information eines Schuleres:\n"+super.toString()+" credit: "+credit;
    }
}

