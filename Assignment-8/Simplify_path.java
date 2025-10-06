class Solution {
    public String simplifyPath(String path) {
        Stack<String> sk = new Stack<>();
        String[] files = path.split("/");
        for(String item : files){
            if(item.equals(".") || item.isEmpty()) continue;
            else if(item.equals("..")){
                if(!sk.isEmpty()){
                    sk.pop();
                }
            }
            else sk.push(item);
        }
        return "/" + String.join("/", sk);
    }
}