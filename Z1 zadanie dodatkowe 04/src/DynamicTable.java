public class DynamicTable {

    double table [] = new double[0];

    void addItem (double newItem) {
        double[] table2 = new double [table.length + 1];
        for (int i = 0; i < table.length; i++) {
            table2 [i] = table[i];
        }
        table2[table2.length - 1] = newItem;
        table = table2;
    }

    void deleteItem (int deleteIndex) {
        if (deleteIndex < 0 || deleteIndex > table.length - 1) {
            return;
        }
        double[] table2 = new double [table.length - 1];
        int j = 0;
        for (int i = 0; i < table.length; i++) {
            if (i != deleteIndex) {
                table2[j] = table[i];
                j++;
            }
        }
        table = table2;
    }

    public String toString() {
        String temp = "[";
        for (double n: table) {
            temp += n + ", ";
        }
        return temp.substring(0, temp.length() - 2) + "]";
    }

}
