package FileManagement;

/**
 * Represents a command to rename a file from oldName to newName.
 */
public class RenameFileCommand implements Command {
  private String oldName;
  private String newName;

  /**
   * Constructs a RenameFileCommand with the given old and new file names.
   * @param oldName the old name of the file to be renamed
   * @param newName the new name of the file after renaming
   */
  public RenameFileCommand(String oldName, String newName) {
    this.oldName = oldName;
    this.newName = newName;
  }

  /**
   * Executes the command by renaming the file with oldName to newName.
   */
  public void execute() {
    // rename file with oldName to newName
  }
}