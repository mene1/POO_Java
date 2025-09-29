import java.util.Scanner;

class op{
    public static void main(String[] args){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Digite quantos minutos você consumiu");

        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        /*
        if (min > 100){
            int total = 50 + ((min-100)*2);
            System.out.println(total);
        } else {
            System.out.println("50 Reais");
        }
        */

        double conta = (min > 100) ? 50.0 + ((min-100) * 2) : 50.0;
        System.out.println(conta);
    }
}