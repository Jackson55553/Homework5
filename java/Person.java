class Person {
      private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int wage;
    private int age;

    public int getAge() {
        return age;
    }

    Person(String name, String position, String email, int phoneNumber, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", wage=" + wage +
                ", age=" + age +
                '}';
    }
}
