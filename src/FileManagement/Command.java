package FileManagement;
/**
 * The Command interface represents an action to be executed in the context of a file management
 * system.
 */
public interface Command {
  /**
   * Executes the command and throw exception.
   */
  void execute() throws Exception;
}
