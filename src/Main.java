import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Введите пятизначное число:");
                int[] arr=task1(scanner.nextInt());
                scanner.close();
                for(int num:arr){
                        System.out.println(num+"\n");
                }
                System.out.println(task2(5,10,10));
        }

        public static int[] task1(int num){
                int splitFactor=10000;
                int[] arr=new int[5];
                for (int i=0;i<5;i++){
                        arr[i]=(num/splitFactor)%10;
                        splitFactor/=10;
                }
                return arr;
        }
        public static double task2(double a,double b,double c){
                double p=(a + b + c) /2;
                double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
                return s;
        }
}
