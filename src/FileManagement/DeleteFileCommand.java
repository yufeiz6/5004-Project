package FileManagement;

/**
 * Represents a command to delete a file with a given file name.
 */
public class DeleteFileCommand implements Command {
  private String fileName;

  /**
   * Constructs a DeleteFileCommand with the given file name.
   * @param fileName the name of the file to be deleted
   */
  public DeleteFileCommand(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Executes the command by deleting the file with the specified file name.
   */
  public void execute() {
    // delete file with fileName
  }
}