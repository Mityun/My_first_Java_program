package bank.agents.clients;

public class CommonClient implements IClient {

    private String serviceType;

    public CommonClient(String serviceType) {this.serviceType = serviceType;
    }

    @Override
    public String getServiceType() {return this.serviceType;
    }

    @Override
    public void setTicketId(int id) {

    }

    @Override
    public int getTicketId() {return 0;
    }

    @Override
    public void setStartTime(int time) {

    }

    @Override
    public int getWaitingTime() {return 0;
    }

    @Override
    public void setApproximatedTime(int time) {

    }

    @Override
    public int getApproximatedTime() {return 0;
    }
}
