/*
 * Application's code
 */

public class AgentApplication {

	public static void main(String[] args) {
		// Build agents route (the tour)
		Node[] tour = new NodeImpl[3];
		try {
			// Every array's element is a node (3 nodes)
			for(int i = 0; i < 3; i++) tour[i] = new NodeImpl(i);
			// Agent's creation
			Agent agent = new MyAgent(tour);
			// Starting the agent
			agent.start();
		} catch (NodeLinkingException e) {
			System.err.println("Errore nella creazione del link verso il nodo " + e);
		}

	}

}
