class Kulig {
    DzieckoNaSankach kon;

    public void dodajDziecko (Integer dziecko) {

        DzieckoNaSankach dzieckoNaSankach = new DzieckoNaSankach();
        dzieckoNaSankach.dziecko = dziecko;

        if (kon == null) {
            kon = dzieckoNaSankach;
        } else {
            DzieckoNaSankach ostatnieDzieckoNaSankach = kon;
            while (ostatnieDzieckoNaSankach.nastepny != null) {
                ostatnieDzieckoNaSankach = ostatnieDzieckoNaSankach.nastepny;
            }
            ostatnieDzieckoNaSankach.nastepny = dzieckoNaSankach;
        }

        DzieckoNaSankach ostatnieDzieckoNaSankach = kon;
    }

    public void print() {
        DzieckoNaSankach ostatnieDzieckoNaSankach = kon;
        while (ostatnieDzieckoNaSankach != null) {
            System.out.println(ostatnieDzieckoNaSankach.dziecko +" ");
            ostatnieDzieckoNaSankach = ostatnieDzieckoNaSankach.nastepny;
        }
    }
}
class DzieckoNaSankach {
    Integer dziecko;
    DzieckoNaSankach nastepny;
}

public class Main {
    public static void main(String[] args) {

        System.out.println("kulig jedzie");

        Kulig kulig = new Kulig();
        kulig.dodajDziecko(1);
        kulig.dodajDziecko(25);
        kulig.dodajDziecko(16);

        kulig.print();
    }
}