import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int dogumYili;
            System.out.print("Dogun Yilinizi Giriniz : ");
            dogumYili=input.nextInt();

            switch (dogumYili%12) {
                case 0:System.out.println("Cin Zodyagi Burcunuz : Maymun");
                    
                    break;
                
                case 1:System.out.println("Cin Zodyagi Burcunuz : Horoz");
                    
                    break;
                case 2:System.out.println("Cin Zodyagi Burcunuz : Kopek");
                    
                    break;
                
                case 3:System.out.println("Cin Zodyagi Burcunuz : Domuz");
                    
                    break;
                case 4:System.out.println("Cin Zodyagi Burcunuz : Fare");
                    
                    break;
                
                case 5:System.out.println("Cin Zodyagi Burcunuz : Okuz");
                    
                    break;
                case 6:System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                    
                    break;
                
                case 7:System.out.println("Cin Zodyagi Burcunuz : Tavsan");
                    
                    break;
                case 8:System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                    
                    break;
                
                case 9:System.out.println("Cin Zodyagi Burcunuz : Yilan");
                    
                    break;
                case 10:System.out.println("Cin Zodyagi Burcunuz : At");
                    
                    break;
                
                case 11:System.out.println("Cin Zodyagi Burcunuz : Koyun");
                    
                    break;
                default:System.out.println("Gecersiz Bir Tarih Girdiniz !");
                    break;
            }
        }
    }
    
}
