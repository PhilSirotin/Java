public class ToolMain {
  public static void main(String[] args) {
    Tool[] tools = {
      new Hammer(),
      new Screwdriver(),
      new Wrench()
    };

    for (Tool tool : tools) {
      tool.use();
    }
  }
}