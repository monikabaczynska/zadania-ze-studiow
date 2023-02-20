public class UniqueTable {

    double table[] = new double[0];

    public void addItem (double newItem) {
        for (double i: table) {
            if (i == newItem) {
                return;
            }
        }
        double table2[] = new double[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            table2 [i] = table [i];
        }
        table2 [table2.length - 1] = newItem;
        table = table2;
    }

    public void deleteItem (double deleteItem) {
        boolean contains = false;
        for (double i: table) {
            if (i == deleteItem) {
                contains = true;
            }
        }
        if (!contains) {
            return;
        }
        double table2[] = new double[table.length - 1];
        int j = 0;
        for (int i = 0; i < table.length; i++) {
            if (table [i] == deleteItem) {
                continue;
            }
            table2 [j] = table [i];
            j++;
        }
        table = table2;
    }

    public String toString() {
        String string = "[";
        for (double temp: table) {
            string += temp + ", ";
        }
        return string.substring(0, string.length() - 2) + "]";
    }

}
