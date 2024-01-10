import java.io.*;
import java.rmi.*;

/*
 * This interface is used to realize the agents.
 * The agents are serilizable objects.
 */

// Agent is transferable (because extends Serializable) and runnable (because extends Runnable)
public interface Agent extends Serializable, Runnable{
	//Agent body: the code in this method will be executed whenever the agent reaches a node
	public void run();
	// Migrates the agent that invokes this method to the specified node
	public void migrateTo(Node node) throws RemoteException;
	//Starts the execution of the agent in a new thread
	public void start(); 
}
