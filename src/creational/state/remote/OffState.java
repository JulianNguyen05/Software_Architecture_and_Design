package creational.state.remote;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("==OFF TV --> ON TV==");
        remote.setState(new OnState());
    }
}
