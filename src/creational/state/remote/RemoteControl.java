package creational.state.remote;

public class RemoteControl {
    IRemoteState state;

    public RemoteControl() {
        state = new OffState();
    }

    public void setState(IRemoteState state){
        this.state = state;
    }

    public void powerPress(){
        state.handle(this);
    }
}
