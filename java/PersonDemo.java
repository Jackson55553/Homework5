public class PersonDemo {
     public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Andrei", "Engineer", "Andr@mail.ru", 4359078, 55000, 63);
        persArray[1] = new Person("Slava", "Engineer", "sls@mail.ru", 2346256, 65000, 23);
        persArray[2] = new Person("Mihail", "Engineer", "michas@mail.ru", 635745524, 47000, 54);
        persArray[3] = new Person("Anna", "Engineer", "ananas@mail.ru", 676547824, 38000, 48);
        persArray[4] = new Person("Dariya", "Engineer", "dr434@mail.ru", 635524, 37000, 35);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i].toString());

            }
        }
    }
}
