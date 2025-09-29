import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int rs=0, re=matrix.length-1, cs = 0, ce = matrix[0].length-1;
        while(cs<=ce && rs<=re){

            for(int i=cs;i<=ce;i++){
            ll.add(matrix[rs][i]);
            }
            rs++;// pheli row ki zarurat nhi ab

            for(int i=rs;i<=re;i++){
                ll.add(matrix[i][ce]);
            }
            ce--;//last column ki zaroorat nhi

            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    ll.add(matrix[re][i]);
                }}
            re--;//last row ki zaroorat nhi

            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                ll.add(matrix[i][cs]);
                }}
            cs++;
            
        }
        return ll;
        
    }
}