package FileManagement;

import java.io.File;

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
   * If the file exists, it will rename the file to a new name and
   * print out "File rename successfully!".
   * If the file exists while fails to rename the file,
   * it will throw an exception "Failed to rename file!".
   * Otherwise, the execution throws an exception "File does not exist!"
   */
  public void execute() throws Exception {
    // Create a File object with oldName.
    File file = new File(oldName);
    if (file.exists()) {
      File newFile = new File(newName);
      if (file.renameTo(newFile)) {
        System.out.println("File rename successfully!");
      } else {
        throw new Exception("Failed to rename file!");
      }
    } else {
      throw new Exception("File does not exist!");
    }

  }
}

