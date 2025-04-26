package Homework13.Task1;

public class Enigma {
    public static void main(String[] args) {
        int shift = 4;
        Encrypt encrypt = new Encrypt("I love coding Java");
        System.out.println("Original text " + encrypt.getStr());
        String encrypted = encrypt.encrypt(shift);
        Decrypt decrypt = new Decrypt(encrypted);
        String decrypted = decrypt.decrypt(shift);
        System.out.println("Encrypted text " + encrypted);
        System.out.println("Decrypted text " + decrypted);
    }
}
