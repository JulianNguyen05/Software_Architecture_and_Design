package creational.state.remote;

public class OnState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("==ON TV --> OFF TV==");
        remote.setState(new OffState());
    }
}
