public class Test {
    public static void main(String[] args) {

    }
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException exception) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException exception2) {
        }
        return false;
    }
}
