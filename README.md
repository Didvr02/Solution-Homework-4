# Homework 4: Advanced Structural Patterns – Singleton & Adapter

This project demonstrates the implementation of two important structural design patterns in Java:
1. **Singleton Pattern**: Used to create a global configuration manager.
2. **Adapter Pattern**: Used to integrate a legacy chat service into a new system.



## **Project Structure**

The project consists of the following classes:

### **Singleton Pattern**
 **ConfigurationManager.java**: Implements the Singleton pattern to manage global configuration settings.
 **ConfigManagerDemo.java**: Demonstrates the usage of the `ConfigurationManager`.

### **Adapter Pattern**
 **LegacyChatService.java**: Simulates a legacy chat service with its own interface.
 **ChatService.java**: Defines the new interface for chat services.
 **ChatServiceAdapter.java**: Adapts the legacy chat service to the new interface.
 **ChatAdapterDemo.java**: Demonstrates the usage of the `ChatServiceAdapter`.


## Code Explanation
### Singleton Pattern
#### ConfigurationManager:

Ensures only one instance of the configuration manager exists.

Loads default configurations (e.g., maxPlayers, defaultLanguage).

Provides methods to retrieve and print configurations.

### ConfigManagerDemo:

Demonstrates how to use the ConfigurationManager to access and print configurations.

### Adapter Pattern
#### LegacyChatService:

Simulates a legacy chat service with a method sendLegacyMessage.

#### ChatService:

Defines the new interface with a method sendMessage.

#### ChatServiceAdapter:

Implements the ChatService interface.

Adapts the sendMessage method to call the legacy sendLegacyMessage method.

#### ChatAdapterDemo:

Demonstrates how to use the ChatServiceAdapter to send a message through the legacy service.

Design Patterns Used
Singleton Pattern
Ensures a single instance of the ConfigurationManager exists.

Provides a global point of access to configuration settings.

Adapter Pattern
Bridges the gap between the legacy LegacyChatService and the new ChatService interface.

Allows the legacy service to be used in a new system without modifying its code.

## Testing
### ConfigurationManager
#### The ConfigManagerDemo class tests the following:

Retrieval of configuration values (e.g., maxPlayers, defaultLanguage).

Printing all configuration settings.

### ChatServiceAdapter
#### The ChatAdapterDemo class tests the following:

Sending a message through the adapter.

Verifying that the output matches the legacy format (Legacy Chat: <message>).

### Code Quality
#### Single Responsibility Principle:

Each class has a single responsibility (e.g., ConfigurationManager manages configurations, ChatServiceAdapter adapts the legacy service).

#### Dependency Inversion Principle:

The ChatServiceAdapter depends on the ChatService interface, not concrete implementations.

#### Naming Conventions:

Class names use PascalCase (e.g., ConfigurationManager).

Method and variable names use camelCase (e.g., getConfig, sendMessage).

