public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = 9999999;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int average(){
        int amount=0;
        for (long sale:sales) {
            if (min() != sale && max() != sale) {
                amount += sale;
            }
        }
        return amount/sales.length;
    }
}


