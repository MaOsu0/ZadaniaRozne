import java.util.Scanner;

public class Hospital {
//
//    final int MAX_WORKERS = 10;
//    int count = 0;
//    Person[] employees = new Person[3];
//
//    public void add(Person person) {
//        if (count < MAX_WORKERS) {
//            employees[count] = person;
//            count++;
//        } else {
//            System.out.println("Brak miejsca w szpitalu.");
//        }
//    }
//
//    public String getInfo() {
//        String info = "";
//        for (int i = 0; i < count; i++) {
//            info = info + employees[i].getInfo();
//        }
//        return info;
//    }

    Person[] people = new Person[4];

    Scanner sc = new Scanner(System.in);
    private int counting = 0;

    public void add(Person person) {
        if (counting < people.length) {
            people[counting] = person;
            counting++;

        } else {
            System.out.println("Brak miejsca w szpitalu");
        }
    }

    public Person addDoctor(){
        System.out.println("Podaj dane o doktorze");
        Person doctor = new Doctor(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
        return doctor;
    }

    public Person addNurse(){
        System.out.println("Podaj dane o doktorze");
        Person nurse = new Nurse(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextInt());
        return nurse;
    }

    public String getInfo() {
//        return person.getInfo() + ". Liczba pracowników to: " + counting;

        String info = "";
        for (int i = 0; i < counting; i++) {
            info = info + people[i].getInfo() + "\n";
        }
        return info;
    }

}
