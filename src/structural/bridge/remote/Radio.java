package structural.bridge.remote;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is now OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = Math.max(0, Math.min(100, percent));
        System.out.println("Radio volume set to " + volume + "%");
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio channel set to " + channel);
    }
}

