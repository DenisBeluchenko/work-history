public class Main {
    public static void main(String[] args) {
        int[] sales={1,5,9,4};
        SalesManager sale= new SalesManager(sales);
        System.out.println(sale.max());
        System.out.println(sale.average());
    }
}
