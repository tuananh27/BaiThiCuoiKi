package baithicuoiki;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachHangHoa dsHH = new DanhSachHangHoa();
        Scanner sc = new Scanner(System.in);
        try {
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            String s = "20-02-2022";
            String s1 = "26-02-2022";
            String s2 = "28-02-2022";
            String s3 = "25-06-2022";
            Date d = sf.parse(s);
            Date d1 = sf.parse(s1);
            Date d2 = sf.parse(s2);
            Date d3 = sf.parse(s3);

            HangHoa h1 = new HangHoaThucPham(12, "Bia", 1500, d, d2, "Tiger");
            HangHoa h2 = new HangHoaDienMay(1, "Tu lanh", 1_500_000, 20, 80);
            HangHoa h3 = new HangHoaSanhSu(20, "Thia", 20_000, "Inox", d1);
            HangHoa h4 = new HangHoaDienMay(5, "Tivi", 5_000_000, 10, 50);
            HangHoa h5 = new HangHoaSanhSu(15, "Ke Bat", 200_000, "Inox", d2);
            HangHoa h6 = new HangHoaThucPham(78, "bi dao", 2000, d1, d2, "Cong ty");
            HangHoa h7 = new HangHoaDienMay(10, "May giat", 3_000_000, 10, 100);
            HangHoa h8 = new HangHoaThucPham(10, "Mi ly", 1000, d1, d3, "exicook");
            HangHoa h9 = new HangHoaSanhSu(5, "Chen", 5000, "Inox", d2);
            HangHoa h10 = new HangHoaDienMay(9, "May suoi", 1_000_000, 10, 90);


            dsHH.add(h1);
            dsHH.add(h2);
            dsHH.add(h3);
            dsHH.add(h4);
            dsHH.add(h5);
            dsHH.add(h6);
            dsHH.add(h7);
            dsHH.add(h8);
            dsHH.add(h9);
            dsHH.add(h10);
        } catch (Exception e) {
            
        }
        do{
            System.out.println("----------Menu------------");
            System.out.println("|1.Them                  |");
            System.out.println("|2.Xuat                  |");
            System.out.println("|3.Tim Kiem              |");
            System.out.println("|4.Xoa                   |");
            System.out.println("|5.Sap xep               |");
            System.out.println("|6.Thong Ke              |");
            System.out.println("|7.Ket thuc              |");
            System.out.println("--------------------------");
            int key1 = sc.nextInt();
            sc.nextLine();
            switch(key1){
                case 1:
                dsHH.them();
                break;
                case 2:
                dsHH.hienThiHangHoa();
                break;
                case 3:
                System.out.println("Nhap Id Muon tim kiem: ");
                int maHang = sc.nextInt();
                dsHH.timHangHoa(maHang);
                break;
                case 4:
                System.out.println("Nhap Id Mun Xoa");
                int maH = sc.nextInt();
                dsHH.xoa(maH);
                break;
                case 5:
                dsHH.sapXepHangHoa();
                break;
                case 6:
                dsHH.thongKe();
                break;
                case 7: 
                System.out.println("Thoat!!");
                System.exit(0);
            }
        }while(true);
    }    
}
