# 5004-Project / Command Pattern

by Yufei Zhang, Zhen Yu Wang, Yi Zheng

## Pattern Description

**The Command Pattern** encapsulates a request as an object, thereby letting us parameterize other
objects with different requests, queue or log requests, and support undoable operations.

### How the pattern works?

The Command pattern is a behavioral design pattern that allows you to encapsulate a request as an
object, thereby allowing you to parameterize clients with different requests, queue or log requests,
and support undoable operations.

The basic idea behind the Command pattern is to provide a way to separate the requester of an action
from the object that actually performs the action. Instead of the requester interacting directly
with the object that performs the action, the requester sends a request to an object called the
Command object, which in turn interacts with the object that performs the action.

The command pattern has a few major components including client, invoker, command, and receiver.
When the client wants to perform an action, it creates a command object and sets its receiver. It
then passes the command object to an invoker object, which stores the command and invokes it at a
later time. When the command is invoked, it calls the appropriate method on the receiver, which
performs the actual action.

![Command Pattern diagram](Images/patternDiagram.jpeg)

### When to use this pattern?

The command design pattern is useful whenever there is a need to separate the request for an action
from the implementation of that action. Some examples include, but are not limited to:

#### Secnario1:

In GUI applications, the command pattern can be used to implement menu buttons, which decouples the
button object from the object that actually performs the action. In such a design, the button simply
sends the request to the command object, while not knowing how the action is performed or what
objects are involved. Doing so provides the program with improved modularity and flexibility, as the
implementation of the actions and the buttons can be developed, tested, and maintained separately

#### Secnario2:

In a program that supports undo/redo operations across multiple levels, the command pattern can be
used to implement an undo/redo method for each command action object. In such a design, the program
can use stacks to separately store a history of commands that were called, along with their
associated parameters. When the user calls undo/redo, the program simply pops the most recent
command object from the stack and calls its undo/redo method. Doing so provides the program with a
clear separation of concerns between the command and the underlying logic of the operation, making
it easier to add new actions without affecting the existing functionalities

### An example using this pattern

For a real implementation example, let’s say there is a file management system that creates,
deletes, and renames a file. Using the command design pattern, there would be 3 concrete command
classes for each of these actions that contain the logic to perform them on a receiver. For example,
a createFile concrete command class might have an execute method to call the create file action in
the receiver, it might also have an undo method to call the delete file action in the receiver. When
called, the concrete command class creates a new command object for this action. On the other hand,
the receiver class contains methods to actually perform these actions when it is called by the
concrete command class. Finally, the invoker class would contain a method to run the command objects
that were created, such as the create, delete, and rename command objects. The invoker class would
also keep track of the executed or undone commands history on separate stacks, and use methods to
call the undo or redo command objects, then popping them off from the stacks.

## Code Description

### How the code works?

The code for our project is used for the file management system.
Command interface:This Java code defines an interface called "Command" in the package "FileManagement". This interface represents an action to be executed in the context of a file management system. It  has a single method ‘execute()’ without arguments and returned value and throws an exception when necessary.

CreateFileCommand:
This Java code defines a class called ‘CreateFileCommand’ as implementation of the ‘Command’ interface. This class can be used as a command object in a file management system to create a file with a given name. The class has a single instance variable called ’fileName’ storing the name of the file to be created. The constructor takes a single argument, the file name.
If the file is successfully created, the message ‘File created successfully!’ will be printed out. If the file already exists, the method throws an Exception with the message ‘File already exists!’.

DeleteFileCommand:
This Java code defines a class called "DeleteFileCommand" in the package "FileManagement", which implements the "Command" interface. This class can be used as a command object in a file management system to delete a file with a given file name. The class has a single instance variable called "fileName", which stores the name of the file to be deleted. The constructor takes a single argument, the file name.
If the file exists, the method calls the "delete()" method on the File object to delete the file. If the file is successfully deleted, the method prints a message saying so. If the file does not exist, the method throws an Exception with the message "File does not exist!".

RenameFileCommand:
This Java code defines a class called "RenameFileCommand" in the package "FileManagement", which implements the "Command" interface and provides an implementation of the execute() method.
It then checks whether the file exists using the exists() method. If the file exists, it creates a new File object with the newName parameter and renames the file using the renameTo() method.
If the renaming is successful, the method prints out "File rename successfully!" to the console. If the renaming fails, the method throws an exception with the message "Failed to rename file!". If the file does not exist, the method throws an exception with the message "File does not exist!".

FileInvoker:
The FileInvoker class is responsible for invoking a command in the context of a file management system.
The Thread.sleep(3000) in the executeCommand method is used for the slow show of the change when execution.

Driver:
This program demonstrates the usage of the Command pattern in a file management system. The main method creates a FileInvoker object and executes several commands on it, including creating and renaming files, and deleting files. If any of these commands fail, an exception will be thrown and caught in a try-catch block, with the error message printed.


### How to run the code?

Click the run in the drive and the change of files can be observed in the current path.
The program starts by creating a FileInvoker object, which will be used to execute the commands. Then it creates three CreateFileCommand objects to create three different files named "file.txt", "file2.txt", and "file3.txt". Each command is set on the FileInvoker object, and then the executeCommand() method is called to execute the command.
After creating the files, the program renames two of them using RenameFileCommand objects. The first file "file.txt" is renamed to "newFile.txt", and the second file "file2.txt" is renamed to "newFile2.txt". Again, each command is set on the FileInvoker object and executed.
Finally, the program deletes the file "newFile.txt" using a DeleteFileCommand object. The command is set on the FileInvoker object and executed.
If any of the commands fail, an exception will be thrown and caught in the try-catch block, and the error message will be printed.


## UML diagram

![UML diagram](Images/UML)

- Our driver class acts as the client which is responsible for creating concrete command and setting
  its receiver.

- The Java.io.File we imported acts as the receiver and it knows how to perform the work needed to
  carry out the request.

- The FileInvoker class is our invoker and it holds a command and act at some point asks the command
  to carry out a request by calling its execute() method.

- The Command declares an interface for all commands and a command is invoked through the execute()
  method, which asks a receiver to perform an action.

- RenameFileCommand, CreateFileCommand, and DeleteFileCommand are the concrete classes implements
  the
  Command interface. They defines the binding between an action and a receiver. The invoker makes a
  request by calling execute() and those concrete classes carry it out by calling actions on the
  receiver.

## Reference

Head First Design Patterns [Book]. (n.d.).
Www.oreilly.com. https://www.oreilly.com/library/view/head-first-design/0596007124/

Command. (2014). Refactoring.guru. https://refactoring.guru/design-patterns/command

Command Design Pattern | DigitalOcean. (n.d.).
Www.digitalocean.com. https://www.digitalocean.com/community/tutorials/command-design-pattern

