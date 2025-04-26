package Homework13.Task1;

public class Encrypt {
    private String str;

    public Encrypt(String str) {
        this.str = str;
    }

    protected String encrypt(int n) {
        StringBuilder encryptedString = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + n) % 26 + base);
            }
            encryptedString.append(c);
        }
        return encryptedString.toString();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
