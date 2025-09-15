package creational.builder.computer;

public class Computer {
    String cpu, ram, storage, screen;

    private Computer(Builder b){
        cpu = b.cpu;
        ram = b.ram;
        storage = b.storage;
        screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder{
        String cpu, ram, storage, screen;
        public Builder builderCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder builderRam(String ram){
            this.ram = ram;
            return this;
        }

        public Builder builderStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder builderScreen(String screen){
            this.screen = screen;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
