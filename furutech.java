/**
 * Concrete implementation of a UK electrical plug connector.
 * Represents a Furutech brand UK plug that can deliver electricity.
 */
public final class furutech implements UKPlugConnector{
    
    /**
     * Delivers electricity through the Furutech UK plug connector.
     * Prints a message to indicate the action.
     */
    public void provideElectricity(){
        System.out.println("giving electricity to a furutech plug.");
    }
}