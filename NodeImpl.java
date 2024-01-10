import java.rmi.*;
import java.net.*;

/*
 * Implementation of Node Interface.
 */

class NodeLinkingException extends Exception {
	private static final long serialVersionUID = 1L;

}

public class NodeImpl implements Node {
	private static final long serialVersionUID = 1L;

	// Global reference to container
	private AgentContainer container;

	public NodeImpl(int index) throws NodeLinkingException {
		try {
			container = (AgentContainer)Naming.lookup("rmi://127.0.0.1/container"+index);
			System.out.println(container);
		} catch (RemoteException e) {
			System.err.println("Registry could not be contacted");
			throw new NodeLinkingException();
		} catch (MalformedURLException e) {
			System.err.println("Wrong URL for binding");
				throw new NodeLinkingException();
		} catch (NotBoundException e) {
			System.err.println("Object not bound");
				throw new NodeLinkingException();
		} 
	}
	
	// Implementation of migrate method
	public void migrate(Agent agent) throws RemoteException {
		container.migrate(agent);
	}
}