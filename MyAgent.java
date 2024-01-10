import java.util.*;
import java.rmi.*;

public class MyAgent extends AbstractAgent {
	private static final long serialVersionUID = 1L;
	private Node[] nodesToVisit;	// Nodes to visit
	private int visited;	// Number of containers visited
	private ArrayList<String> nameList;	// Final output
	
	/*
	 * Constructor of MyAgent
	 */
	public MyAgent(Node[] nv) {
		nodesToVisit = nv;
		nameList = new ArrayList<String>();
		visited = -1;
	}
	
	/*
	 * Agent's behaviours based on "visited" variable's value
	 */
	public void run() {
		System.out.println(visited + " " + nodesToVisit.length);
		// If agent hasn't completed the route 
		if(visited < nodesToVisit.length -1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Inserisci il tuo nome");
			nameList.add(sc.nextLine());
			try {
				migrateTo(nodesToVisit[++visited]);	// Agent's migration to other node
			} catch (RemoteException e) {System.err.println("Errore in migrazione " + e);}
		}
		// If agent has completed the route 
		else {
			System.out.println(nameList);
		}
		
	}
}
