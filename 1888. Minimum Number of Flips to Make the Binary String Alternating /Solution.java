import java.util.*;

class Solution {
    public static int minFlips(String s) {       
        int x=0,y=0;
        int n=s.length();
        s=s+s;
        int count=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
                char a = (i%2==0)?'0':'1';
                char b = (i%2==0)?'1':'0';
                if(s.charAt(i)!=a){
                    x++;
                }
                if(s.charAt(i)!=b){
                    y++;
                }
                if(i >= n){
                char prev = s.charAt(i - n);

                if(prev != ((i - n) % 2 == 0 ? '0' : '1')) x--;
                if(prev != ((i - n) % 2 == 0 ? '1' : '0')) y--;
            }

            if(i >= n - 1){
                count = Math.min(count, Math.min(x, y));
            }
        }
        return count;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.next();
        int result = minFlips(s);
        System.out.println("Minimum flips required: " + result);
        sc.close();
    }
}

