package baithicuoiki;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class HangHoa {
    private int maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;

    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public int getMaHang() {
        return maHang;
    }
    public void setMaHang(int maHang) {
        if(maHang >0){
            this.maHang = maHang;
        }else{
            System.out.println("Ma Hang Khong Duoc Bang Khong");
        }
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten Hang Khong Duoc De Rong");
        }
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        if(soLuongTon >= 0){
            this.soLuongTon = soLuongTon;
        }else{
            System.out.println("So Luong Phai Lon Hon Hoac Bang Khong");
        }
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("Don Gia Phai Lon Hon 0");
        }
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi","VN");
        NumberFormat tienViet = NumberFormat.getCurrencyInstance(localeVN);
        String str = tienViet.format(donGia);
        return "HangHoa [donGia=" + str + ", maHang=" + maHang + ", soLuongTon=" + soLuongTon + ", tenHang="
                + tenHang + "]";
    }

    

    

    

   

    

    
}
