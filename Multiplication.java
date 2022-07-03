import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("출력할 구구단을 입력하세요 0을 누르면 종료됩니다.");
            int input = sc.nextInt();

            if((1<=input) && (input<10))
            {
                for(int i=1; i<10; i++)
                {
                    System.out.println( input + " * " + i + " = " + (input*i) );
                }
            }
            else if(input == 0)
            {
                break;
            }
            else
            {
                System.out.println("1~9까지의 숫자를 입력해주세요");
            }
        }while(true);
        
        sc.close();

    }
    
}
