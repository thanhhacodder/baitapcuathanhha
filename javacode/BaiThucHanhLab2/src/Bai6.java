import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,giai_thua=1;
        do{
            System.out.print("Nhap vao 1 so nguyen duong: ");
            n=scanner.nextInt();
        }while(n<0);
        for(int i=n;i>=1;i--){
            giai_thua*=i;
        }
        System.out.printf("Giai thua cua n la: %d",giai_thua);;
    }
}
