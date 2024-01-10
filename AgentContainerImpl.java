import java.rmi.*;
import java.rmi.server.*;

/*
 * Implementation of AgentContainer, it extends UnicastremoteObject because container is remote object.
 */

public class AgentContainerImpl extends UnicastRemoteObject implements AgentContainer {
	
	private static final long serialVersionUID = 1L;
	public AgentContainerImpl() throws RemoteException {}

	// If the container receive agent it must runs it
	public void migrate(Agent agent) throws RemoteException {
		// Weak mobility: starts the agent body when the agent reaches the node
		if(agent != null) agent.start();
	}

}
