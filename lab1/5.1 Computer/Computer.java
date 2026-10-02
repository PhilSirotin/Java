public class Computer {
  private final CPU cpu;
  private final Memory memory;
  private final Storage storage;
  private final Monitor monitor;

  public Computer(CPU cpu, Memory memory, Storage storage, Monitor monitor) {
    this.cpu = cpu;
    this.memory = memory;
    this.storage = storage;
    this.monitor = monitor;
  }

  public void powerOn() {
       System.out.println("Компьютер включен.");
        System.out.println("CPU: " + cpu);
        System.out.println("Память: " + memory);
        System.out.println("Накопитель: " + storage);
        System.out.println("Монитор: " + monitor);
  }
}
