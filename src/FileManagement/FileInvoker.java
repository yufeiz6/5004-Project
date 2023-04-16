package FileManagement;

/**
 * The FileInvoker class is responsible for invoking a command in the context of a file management
 * system.
 */
public class FileInvoker {
  private Command command;

  /**
   * Sets the command to be executed.
   * @param command the command to be executed
   */
  public void setCommand(Command command) {
    this.command = command;
  }

  /**
   * Executes the currently set command with exception
   * and set up the terminals for the better performance.
   */
  public void executeCommand() throws Exception {
    Thread.sleep(3000);
    command.execute();
  }
}
