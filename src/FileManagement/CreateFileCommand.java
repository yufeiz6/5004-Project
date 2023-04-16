package FileManagement;

/**
 * Represents a command to create a file with a given file name.
 */
public class CreateFileCommand implements Command {
  private String fileName;

  /**
   * Constructs a CreateFileCommand object with the given file name.
   * @param fileName the name of the file to be created
   */
  public CreateFileCommand(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Executes the command by creating a file with the specified file name..
   */
  public void execute() {
    // create file with fileName
  }
}
