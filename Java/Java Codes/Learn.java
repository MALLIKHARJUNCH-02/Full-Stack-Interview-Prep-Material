import java.util.Scanner;

public class Learn {

    public static boolean isPrime(int num){
        if(num <=1) return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number Of Rows : ");
        int rows = input.nextInt();

        System.out.println("Enter The Number Of Column : ");
        int column = input.nextInt();

        int[][] matrix = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter The Value Of The Cell [ " + i + " ][ " + j + " ]");
                matrix[i][j] = input.nextInt();
            }
        }

        int even = 0;
        int odd = 0;
        int prime = 0;
        System.out.println("Final Matrix IS ");
        for(int i= 0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+"  ");
                
                if(matrix[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }

               int number = matrix[i][j];

               if(isPrime(number)){
                prime++;
               }

            }
            System.out.println();
        }

        System.out.println("Total Number Of Even Numbers : [ "+even+" ] | Odd Numbers : [ "+odd+" ] | Prime Numbers : [ "+prime+" ]");
        input.close();
    }
}
