public class Main {

    public static void main(String[] args) {

        Set<String> setOfString = new HashSet<>();
        setOfString.add("aaaaa");
        setOfString.add("bbbbb");
        setOfString.add("aaaaa");

        System.out.println(setOfString);

        Set<ClassNoEquals> setOfClassNoEquals = new HashSet<>();
        setOfClassNoEquals.add(new ClassNoEquals("aaaaa"));
        setOfClassNoEquals.add(new ClassNoEquals("bbbbb"));
        setOfClassNoEquals.add(new ClassNoEquals("aaaaa"));

        System.out.println(setOfClassNoEquals);

        Set<ClassWithEquals> setOfClassWithEquals = new HashSet<>();
        setOfClassWithEquals.add(new ClassWithEquals("aaaaa"));
        setOfClassWithEquals.add(new ClassWithEquals("bbbbb"));
        setOfClassWithEquals.add(new ClassWithEquals("aaaaa"));

        System.out.println(setOfClassWithEquals);
    }
}
