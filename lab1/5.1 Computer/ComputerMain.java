public class ComputerMain {
  public static void main(String[] args){
        CPU cpu = new CPU("Intel Core i5", 3.5);
        Memory memory = new Memory(16, "DDR4");
        Storage storage = new Storage("SSD", 512);
        Monitor monitor = new Monitor(24, "1920x1080");

        Computer computer = new Computer(cpu, memory, storage, monitor);
        computer.powerOn();
  }
}
