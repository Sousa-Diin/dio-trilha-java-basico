package contabancaria;

/**
 * 
 * @author Wildes Sousa
 * @version 2024.05.20 1.0
 */

public class Conta {
    private int cod_bank;
    private String agency;
    private String client;
    private double account_balance;

    public Conta() {
    } // Contructor default

    /**
     * 
     * Constructor of class
     * 
     * @param cod_bank
     * @param agency
     * @param client
     * @param account_balance
     */
    public Conta(int cod_bank, String agency, String client, double account_balance) {
        this.cod_bank = cod_bank;
        this.agency = agency;
        this.client = client;
        this.account_balance = account_balance;
    }

    /**
     * 
     * @param account_balance set the current account_balance
     */
    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    /**
     * 
     * @param client set client name
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * 
     * @param cod_bank set cod of back
     */
    public void setCod_bank(int cod_bank) {
        this.cod_bank = cod_bank;
    }

    /**
     * 
     * @param agency set agency number
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * 
     * @return double - balance current
     */
    public double getAccount_balance() {
        return account_balance;
    }

    /**
     * 
     * @return String: agency_number
     */
    public String getAgency() {
        return agency;
    }

    /**
     * 
     * @return String client name
     */
    public String getClient() {
        return client;
    }

    /**
     * 
     * @return int cod of banck
     */
    public int getCod_bank() {
        return cod_bank;
    }

    public void print() {

        String phrase = "Olá [" + getClient() + "]," + "obrigado por criar uma conta em nosso banco, sua agência é["
                + getAgency() + "]" + "conta [" + getCod_bank() + "] e seu saldo [ R$ " + getAccount_balance()
                + "] já está disponivel para saque.";
        System.out.println(phrase);

    }

}
