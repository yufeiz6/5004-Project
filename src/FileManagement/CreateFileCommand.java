package FileManagement;

import java.io.File;
import java.io.IOException;

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
   * Executes the command by creating a file with the fileName.
   * If it can be created successfully, the message and the pathway can be printed out.
   * If it can not be created, the message will be "File already exists!".
   */
  public void execute() throws Exception {
    // Create file with fileName.
    File file = new File(fileName);
    if (file.createNewFile()) {
      System.out.println(String.format("File created successfully! %s.", file.getAbsolutePath()));
    } else {
      throw new Exception("File already exists!");
    }
  }
}
