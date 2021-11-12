package bank.agents.windows;

import java.util.List;

public class Window implements IWindow{
    public static Object clientRightNow;

    @Override
    public void setServiceTypes(List<String> serviceTypes) {

    }

    @Override
    public boolean checkIfServiceTypeAllowedInWindow(String serviceType) {
        return false;
    }

    @Override
    public int chooseNextClient() {
        return 0;
    }

    public static Object getClientRightNow(){
        return clientRightNow;
    }

}
