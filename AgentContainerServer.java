import java.rmi.*;
import java.net.*;
 
public class AgentContainerServer{   
	public static void main(String args[])  {      
		try {        
			AgentContainer ac = new AgentContainerImpl();       
			Naming.rebind("rmi://127.0.0.1/container"+args[0], ac);
                        System.out.println("Container registered ok");      
		} catch (AccessException e) { 
			System.err.println("Bind operation not permitted");      
		} catch (RemoteException e) { 
			System.err.println("Registry could not be contacted" + e);
		} catch (MalformedURLException e) { 
			System.err.println("Wrong URL for binding");      
		}   
	}
}
