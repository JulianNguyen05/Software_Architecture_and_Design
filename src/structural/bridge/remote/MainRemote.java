package structural.bridge.remote;

public class MainRemote {
    public static void main(String[] args) {
        AdvancedRemote ar = new AdvancedRemote(new TV());

        ar.togglePower();
        for (int i = 1; i <= 10; i++){
            ar.volumeUp();
        }


    }
}
