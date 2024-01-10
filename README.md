# Java_mobile_agents
Implementation of simple container of mobile agents based on Java RMI.

Implement a simple container of mobile agents based on Java RMI. The container should be able to host a mobile agent and to run it. A specific primitive supported by the container should enable the migration from a container instance to another one. Implement weak mobility (the agent starts the execution from the first statement whenever it arrives onto a new node/container). With this approach, mobility transparency is not ensured.

Write and test a simple application that creates an agent and moves it across at least two other container nodes. On each node, the agent asks for the name of the user and, when it reaches the last node to visit, it shows the complete list of contacted users.

## Spiegazione in italiano
In questo esercizio è stato implementato un semplice container di agenti mobili tramite Java RMI. Il container è in grado di ospitare l'agente mobile ed eseguirlo. Il container prevede una specifica primita che permette il trasferimento dell'agente da un container all'altro. 

Java RMI è un middleware che consente di implementare applicazioni con architettura client server. Tuttavia, in questo caso è stato sfruttato per implementare il paradigma ad agenti mobili. Il paradigma ad agenti mobili è un paradigma diverso rispetto a quello client server. 

Gli elementi fondamentali dell'applicazione sono:
- Container.
- Agenti.
- Il processo server che ospita i container.
- Il main.
  
### Container
Il container concettualmente è un ambiente che ospita gli agenti mobili e ne gestisce l'esecuzione. In termini programmatici lo stesso si configura, in questo caso, come un oggetto remoto. Quindi, un container viene creato istanziando un oggetto remoto. A tal fine è stata prevista l'interfaccia AgentContainer e la classe AgentContainerImpl.

### Agenti mobili
Gli agenti mobili rappresentano le entità che si spostano nei diversi container. A differenza della mobilità del codice con un agente si sposta anche lo stato, non solo il codice. In questo caso un agente mobile si concretizza in un ogetto di tipo MyAgent. La classe MyAgent estende la classe AbstarctAgent, che a sua volta implementa l'interfaccia Agent. Un oggetto di tipo MyAgent è serializzabile. Tramite la serializzazione un oggetto "MyAgent" viene linearizzato e trasferito nel container di destinazione.

### Processo Server
All'avvio del processo server vengono creati dei container. Degli oggetti di tipo Container. Gli stessi sono registrati sul rmiregistry tramite un'operazione di rebind.
