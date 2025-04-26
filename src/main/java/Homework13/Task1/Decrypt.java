package Homework13.Task1;

public class Decrypt extends Encrypt{
    public Decrypt(String str) {
        super(str);
    }

    public String decrypt(int n){
        return encrypt(26-(n%26));
    }
}
