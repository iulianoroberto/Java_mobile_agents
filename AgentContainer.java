import java.rmi.*;

/*
 * This interface represent the container of agent. 
 * The enviroment that host the agent.
 */

// This interface extends Remote, this means that the implementation of the interface (class) will use it to realize remote object (container is remote object)
public interface AgentContainer extends Remote{
	// Migrates the agent to the specifc container
	public void migrate(Agent agent) throws RemoteException;

}
