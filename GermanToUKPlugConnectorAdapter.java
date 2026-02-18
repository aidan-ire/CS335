/**
 * Adapter that converts German plug connectors to UK plug connectors.
 * This class implements the adapter design pattern, allowing German plugs
 * to work with UK electrical sockets by adapting the interface.
 */
public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

    /**
     * The German plug connector being adapted.
     */
    private GermanPlugConnector plug;

    /**
     * Constructs an adapter with a German plug connector.
     * 
     * @param plug the German plug connector to be adapted
     */
    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    /**
     * Provides electricity by delegating to the underlying German plug connector.
     * This method implements the UK interface by calling the German interface method.
     */
    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}