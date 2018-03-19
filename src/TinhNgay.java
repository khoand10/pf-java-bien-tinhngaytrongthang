import java.util.Scanner;

public class TinhNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = sc.nextInt();
        if(month==2){
            System.out.print("The month '2' has 28 or 29 days!");
        }else if(month== 1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.print("The month '" + month + "' has 31 days!");
        }else{
            System.out.print("The month '" + month + "' has 30 days!");
        }
    }
}
