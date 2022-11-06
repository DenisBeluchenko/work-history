public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = 9999999;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int average(){
        int amount=0;
        for (int sale:sales) {
            if (min() != sale && max() != sale) {
                amount += sale;
            }
        }
        return amount/sales.length;
    }
}


