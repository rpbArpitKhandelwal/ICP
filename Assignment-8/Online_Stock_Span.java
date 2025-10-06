class StockSpanner {
    Stack<int[]> sk;

    public StockSpanner() {
        sk = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!sk.isEmpty() && sk.peek()[0] <= price) {
            span += sk.pop()[1];
        }
        sk.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */