public class Main {


    public static void main(String[] args) {

        Person [] wszyscyLudzie = new Person [3];
        wszyscyLudzie [0] = Person.constructPerson("Monika", "Baczyńska");
        wszyscyLudzie [1] = Person.constructPerson("Celina", "Baczyńska");
        wszyscyLudzie [2] = Person.constructPerson("Czarek", "Baczyński");

        familyMembers("Baczyński", wszyscyLudzie);

    }
    public static void familyMembers (String lastName, Person [] persons) {
        for (Person familyMember: persons) {
            if (lastName == familyMember.lastName) {
                System.out.println(familyMember.getFullName());
            }
        }
    }
}