package bank.agents.clients;

public interface IClient {

    String getServiceType();

    void setTicketId(int id);

    int getTicketId();

    void setStartTime(int time);

    int getWaitingTime();

    void setApproximatedTime(int time);

    int getApproximatedTime();

}
