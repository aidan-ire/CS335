/**
 * Test class for demonstrating the adapter design pattern with electrical plugs.
 * Contains test methods for both German-to-UK and UK-to-German plug adapters.
 */
public final class TestPlugs{

	/** 
	 * Main entry point for the test program.
	 * Runs tests for both adapter directions.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}
	
	/**	
	 * Test method for testing GermanToUK Adapter.
	 * Creates a German plug (Zest brand), a UK socket, and an adapter,
	 * then demonstrates the adapter by plugging the adapted German plug
	 * into the UK socket.
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
	}

	/**
	 * Test method for testing UKToGerman Adapter.
	 * Creates a UK plug (Furutech brand), a German socket, and an adapter,
	 * then demonstrates the adapter by plugging the adapted UK plug
	 * into the German socket.
	 */
	public static void testUKToGermanAdapter(){
		/* create a UK plug connector (brand: furutech) */
		UKPlugConnector plug = new furutech();
		/* create a german socket */
		GermanElectricalSocket socket = new GermanElectricalSocket();
		/* create an adapter */
		GermanPlugConnector germanAdapter = new UKToGermanPlugConnectorAdapter(plug);
		/* use this adapter in a german socket */
		if(!socket.plugIn(germanAdapter)){ 
			System.out.println("Failed to plug into the German socket");
		}
	}
}