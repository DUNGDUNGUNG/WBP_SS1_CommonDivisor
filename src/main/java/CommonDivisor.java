import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        int  a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a=sc.nextInt();
        System.out.println("Nhap b: ");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("Khong co uoc boi chung lon nhat");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("Uoc boi chung lon nhat la: " + a);

    }
}
