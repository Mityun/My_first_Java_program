package bank.agents.windows;

import java.util.List;

public interface IWindow {

    void setServiceTypes(List<String> serviceTypes);

    boolean checkIfServiceTypeAllowedInWindow(String serviceType);

    int chooseNextClient();
}
