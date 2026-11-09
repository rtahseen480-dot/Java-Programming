public class bitManipulation {
    public static void oddAndEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int getIthBIt(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBIt(int n, int i){
        int bitMask= 1<<i;
       return n|bitMask;
    }
    public static int clearIthBIt(int n, int i){
        int bitMask=~(1<<i);
        return n &bitMask;
    }
    public static int updateIthBIt(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearIthBIt(n, i);
        // }else{
        //     return setIthBIt(n, i);
        // }
      n= clearIthBIt(n,i); 
      int bitMask=newBit<<i;
      return n| bitMask;

    }
    public static int clearIbit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeBit(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return  n&bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }

    public static int countSetBIt(int n){
        int count=0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
             n=n>>1;
           
        }
         return count;
    }
    public static int fastEXpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n &1) !=0){
                ans *=a;

            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // oddAndEven(5);
        // System.out.println(getIthBIt(15, 2));
        // System.out.println(setIthBIt(10,2));
        // System.out.println(clearIthBIt(10,1));
        // System.out.println(updateIthBIt(10, 2, 1));
        // System.out.println(clearIbit(15,2));
        // System.out.println(clearRangeBit(10, 2, 4));
        // System.out.println(isPowerOfTwo(15));
        // System.out.println(countSetBIt(16));
        System.out.println(fastEXpo(3, 4));


 
    }
    
}
