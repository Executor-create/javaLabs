package src.lab6;

public class RemoteControl {
  private Command command;

  void pressButton() {
    command.execute();
  }

  void setCommand(Command command) {
    this.command = command;
  }
}
