class Solution {
    public int bitwiseComplement(int n) {
        String x= Integer.toBinaryString(n);
         char[] arr = x.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                arr[i]='0';
            }
           else{
                 arr[i]='1';
            }
        }
         String result = new String(arr);
          int num = Integer.parseInt(result, 2);
         return  num;
    }
}
