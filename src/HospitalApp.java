public class HospitalApp {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor("Edward", "Kowalski", 10000, 1000);
//        Nurse nurse = new Nurse("Maria", "Nowak", 20000, 100);
//
//        Hospital hospital = new Hospital();
//
//        hospital.add(doctor);
//        hospital.add(nurse);
//
//        System.out.println(hospital.getInfo());
//    }
//}


        Person doctor = new Doctor("Krystian", "Frąckowiak", 1000, 100);
        Person nurse = new Nurse("Krystyna","Janda",900,10);
        Person nurse2 = new Nurse("Emil","Giertych",1000,5);


        Hospital hospital = new Hospital();

        hospital.add(doctor);
        hospital.add(nurse);
        hospital.add(nurse2);

        System.out.println(hospital.getInfo());


    }
}
