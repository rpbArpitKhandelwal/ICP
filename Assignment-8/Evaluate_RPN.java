class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sk = new Stack<>();
        for (String item : tokens) {
            if (!sk.isEmpty() && item.equals("+")) {
                int a = sk.pop(), b = sk.pop();
                sk.push(b + a);
            } else if (!sk.isEmpty() && item.equals("-")) {
                int a = sk.pop(), b = sk.pop();
                sk.push(b - a);
            } else if (!sk.isEmpty() && item.equals("*")) {
                int a = sk.pop(), b = sk.pop();
                sk.push(b * a);
            } else if (!sk.isEmpty() && item.equals("/")) {
                int a = sk.pop(), b = sk.pop();
                sk.push(b / a);
            } else sk.push(Integer.parseInt(item));
        }
        return sk.peek();
    }
}

// TC : O(N)
// SC : O(N)