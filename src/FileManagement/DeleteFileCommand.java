package FileManagement;

import java.io.File;

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
   * Executes the command by deleting the file with the fileName.
   * If the file exists, it will be deleted and
   * printout "File deleted successfully!". Otherwise, it will throw an
   * exception "File does not exist!".
   */
  public void execute() throws Exception {

    // Create a File object
    File file = new File(fileName);

    if (file.exists()) {
      file.delete();
      System.out.println("File deleted successfully!");
    } else {
      throw new Exception("File does not exist!");
    }
  }
}
