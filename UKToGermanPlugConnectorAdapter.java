/**
 * Adapter that converts UK plug connectors to German plug connectors.
 * This class implements the adapter design pattern, allowing UK plugs
 * to work with German electrical sockets by adapting the interface.
 */
public class UKToGermanPlugConnectorAdapter implements GermanPlugConnector {

    /**
     * The UK plug connector being adapted.
     */
    private UKPlugConnector plug;

    /**
     * Constructs an adapter with a UK plug connector.
     * 
     * @param plug the UK plug connector to be adapted
     */
    public UKToGermanPlugConnectorAdapter(UKPlugConnector plug) {
        this.plug = plug;
    }

    /**
     * Gives electricity by delegating to the underlying UK plug connector.
     * This method implements the German interface by calling the UK interface method.
     */
    @Override
    public void giveElectricity() {
        plug.provideElectricity();
    }

}