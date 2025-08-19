package byannalfr;

public class akunTest {
    public static void main(String[] args) {
        savingTest sa0001 = new savingTest();
        sa0001.balance = 1000;
        sa0001.name = "Traviss";
        sa0001.cetak();
        savingTest sa0002 = new savingTest();
        sa0002.balance = 2000;
        sa0002.name = "Byan";
        sa0002.interestRate = 0.07;
        sa0002.cetak();
        

    }
}
