### Command Design Pattern using Flat Bread purchasing and delivering example
The command pattern is a behavioral design pattern. This pattern intends to encapsulate in an object all the data required for performing a given command.<br />
Encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command.
<br />
This project consists of actions PurchaseBread and DeliverBread. These actions are invoked and then executed on the receiver by the client.
