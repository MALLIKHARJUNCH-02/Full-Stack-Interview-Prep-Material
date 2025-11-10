public class test{

    public static int[] fib(int range) {
        int[] array = new int[range];
        array[0]= 0;
        array[1]= 1;
        for(int i=2;i<range;i++){
            array[i] = array[i-1]+array[i-2];
        }

        return array;
    }
    public static void main(String[] args) {
        int range = 11;

        int[] result = fib(range);

        for(int num:result){
            System.out.println(num);
        }
    }
} 