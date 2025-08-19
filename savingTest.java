package byannalfr;

public class savingTest {
    public double balance;
    public String name;
    public double interestRate = 0.01;

    public void cetak() {
        double interest = balance * interestRate;
        double totalBalance = balance + interest;
        System.out.println("Nama: "+name);
        System.out.println("Saldo Awal: "+balance);
        System.out.println("Bunga: "+interest);
        System.out.println("Total Saldo Setelah Bunga: "+totalBalance);
        System.out.println("-------------------------");
    }
}
