package beziehungLehrerStudent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Tim", 1001, "Kunst", new String[]{"Muster str","11", "01234","Musterland"});
        System.out.println(teacher1.toString());
        teacher1.akademik("Artikel 1: abcd ", "Artikel 2: dfgh");

        Student student1=new Student("Tim", 5001, "Mathe", new String[]{"Muster str","21", "01234","Musterland"}, 2.99);
        System.out.println(student1.toString());

        Course course1=new Course("Netzwerke und Internettechnologien [Grundlagen]",
                "G-101", "Informatik",
                "Sieben Monate");
        System.out.println(course1.toString());

        Lesson lesson1=new Lesson("Netzwerke und Internettechnologien [Grundlagen]",
                "TF_US_NEINT1", "Informatik", "Sieben Monate", "Internettechnologien",
                "TF_US_NEINT1-I1");
        System.out.println(lesson1.toString());
    }


}
