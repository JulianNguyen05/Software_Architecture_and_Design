package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .builderCpu("Intel core i9 2025")
                .builderRam("Samsung 5500MHz 32 GB")
                .builderStorage("NVMe 1TB")
                .builderScreen("24 Inches LG")
                .build();
        System.out.println(computer.toString());
    }
}
