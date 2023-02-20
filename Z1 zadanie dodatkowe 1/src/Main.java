public class Main {


    public static void main(String[] args) {
        Person [] test = {
                Person.constructPerson("Monika", "Baczyński"),
                Person.constructPerson("Marcin", "Baczyński"),
                Person.constructPerson("Celina", "Baczyński"),
                Person.constructPerson("Czarek", "Baczyński"),
                Person.constructPerson("Obca", "Osoba")
        };
        familyMembers("Baczyński", test);
    }

    public static void familyMembers (String lastName, Person[] persons) {
        for (Person p : persons) {
            if (p.lastName == lastName) {
                System.out.println(p.getFullName());
            }
        }
    }
}