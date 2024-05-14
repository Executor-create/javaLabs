package src.lab6;

public class TurnOnCommand implements Command {
  private Light light;

  TurnOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOn();
  }
}