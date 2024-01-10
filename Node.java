import java.rmi.*;
import java.io.*;

// A node is a reference to an agent container
// It is a characterized by an ID
public interface Node extends Serializable {
	public void migrate(Agent agent) throws RemoteException;
}
