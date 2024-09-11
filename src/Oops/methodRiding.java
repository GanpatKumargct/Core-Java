package Oops;

class dad {
    void property(){
        System.out.println("2000 gaj ka property.");
    }
}

class son extends dad{
    @Override
    void property() {
        System.out.println("5000 gaj ka property.");
    }
}
public class methodRiding {
    public static void main(String[] args) {
        dad da = new dad();
        da.property();

        son sn = new son();
        sn.property();
    }
}
