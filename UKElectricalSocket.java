/**
 * Represents a UK electrical socket that accepts UK plug connectors.
 * This class implements the target interface in the adapter design pattern,
 * allowing UK plug connectors to be plugged in and provide electricity.
 */
public class UKElectricalSocket {

    /**
     * Plugs in a UK plug connector and receives electricity from it.
     * 
     * @param plug the UK plug connector to be plugged into this socket
     */
    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}