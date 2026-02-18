/**
 * Represents a German electrical socket that accepts German plug connectors.
 * This class implements the target interface in the adapter design pattern,
 * allowing German plug connectors to be plugged in and provide electricity.
 */
public class GermanElectricalSocket {

    /**
     * Plugs in a German plug connector and receives electricity from it.
     * 
     * @param plug the German plug connector to be plugged into this socket
     */
    public void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}