# Java_mobile_agents
Implementation of simple container of mobile agents based on Java RMI.

Implement a simple container of mobile agents based on Java RMI. The container should be able to host a mobile agent and to run it. A specific primitive supported by the container should enable the migration from a container instance to another one. Implement weak mobility (the agent starts the execution from the first statement whenever it arrives onto a new node/container). With this approach, mobility transparency is not ensured.

Write and test a simple application that creates an agent and moves it across at least two other container nodes. On each node, the agent asks for the name of the user and, when it reaches the last node to visit, it shows the complete list of contacted users.
