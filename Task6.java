import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int flag = 0;
        for(int i = 2; i < Math.sqrt(N); i++){
            if (flag == 0){
                if (N%i == 0){
                    System.out.println("Составноe");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println("Простоe");
        }
       
	}
}
