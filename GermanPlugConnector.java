/**
 * Interface for German electrical plug connectors.
 * Defines the contract for all German plug connectors to provide electricity.
 * This is the source interface in the adapter design pattern.
 */
public interface GermanPlugConnector {

    /**
     * Delivers electricity through this German plug connector.
     */
    public void giveElectricity();
}