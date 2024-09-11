package Oops;

class ATM{
    private String UserName;
    private int PassWord;
    private double Balence;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPassWord() {
        return PassWord;
    }

    public void setPassWord(int passWord) {
        PassWord = passWord;
    }

    public double getBalence() {
        return Balence;
    }

    public void setBalence(double balence) {
        Balence = balence;
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        ATM at = new ATM();
        at.setUserName("gans!");
        at.setPassWord(123);
        at.setBalence(5000);
        System.out.println("................");

        System.out.println(at.getUserName());
        System.out.println(at.getPassWord());
        System.out.println(at.getBalence());

    }
}
