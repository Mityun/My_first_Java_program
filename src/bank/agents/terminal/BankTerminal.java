package bank.agents.terminal;

import bank.agents.board.BankBoard;
import bank.agents.clients.CommonClient;
import bank.agents.clients.IClient;
import bank.utils.BankTimer;
import bank.erros.BankServiceTypeException;

public class BankTerminal {

    private BankTimer timer;
    private BankBoard board;

    public static int doServeClient(IClient client) throws BankServiceTypeException {
        return 0;
    }

    private static boolean checkIfServiceAllowed(String serviceType) throws BankServiceTypeException {
        return false;
    }

    private static int generateId() {
        return 0;
    }

    private static int calculateApproximatedTimeForClient(IClient client) {
        return 0;
    }

    private static void setClientInfo(IClient client) {

    }

    private static void registerClientToBoard(IClient client) {

    }

}
