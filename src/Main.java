public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Sonmalai", "Normal");
        Customer c2 = new Customer("Pka Kolab", "Premium");
        Customer c3 = new Customer("Sopheak Tra", "Gold");

        Sale s1 = new Sale(c1, "29-01-2024");
        Sale s2 = new Sale(c2, "14-02-2023");
        Sale s3 = new Sale(c3, "07-07-2022");

        s1.setServiceExpense(100.0);
        s1.setProductExpense(550.0);
        s2.setServiceExpense(100.0);
        s2.setProductExpense(550.0);
        s3.setServiceExpense(100.0);
        s3.setProductExpense(550.0);

        s1.DisplayInfo();
        s2.DisplayInfo();
        s3.DisplayInfo();
    }
}