public class Main {
    public static void main(String[] args) {
        long[] sales={1,5,9,4};
        SalesManager sale= new SalesManager(sales);
        System.out.println(sale.max());
    }
}
