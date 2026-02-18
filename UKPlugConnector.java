/**
 * Interface for UK electrical plug connectors.
 * Defines the contract for all UK plug connectors to provide electricity.
 * This is the source interface in the adapter design pattern.
 */
public interface UKPlugConnector {

    /**
     * Delivers electricity through this UK plug connector.
     */
    public void provideElectricity();
}