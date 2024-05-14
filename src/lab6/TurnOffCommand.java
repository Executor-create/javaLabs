package src.lab6;

public class TurnOffCommand implements Command {
  private Light light;

  TurnOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOff();
  }
}