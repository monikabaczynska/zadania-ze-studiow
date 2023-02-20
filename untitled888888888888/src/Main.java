class Solution {
    static String removeExclamationMarks(String s) {
        String noweZnaki = "";
        for (char zmiennaWPętli: s) {
            if (zmiennaWPętli != "!") {
                noweZnaki += zmiennaWPętli;
            }
        }
        return noweZnaki;
    }
}