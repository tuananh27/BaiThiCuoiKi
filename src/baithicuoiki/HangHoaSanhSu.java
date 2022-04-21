package baithicuoiki;

import java.util.Date;

public class HangHoaSanhSu extends HangHoa{
    private String nhaSX;
    private Date ngayNhapKho;
    
    public HangHoaSanhSu(int maH, int sLTHKK, String tenHH, double donGiaHH, String nhaSX, Date ngayNhapKho) {
        super(maH, sLTHKK, tenHH, donGiaHH);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public HangHoaSanhSu(String nhaSX, Date ngayNhapKho) {
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSX() {
        return nhaSX;
    }
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        if (ngayNhapKho != null) {
            this.ngayNhapKho = ngayNhapKho;
        } else {
            System.out.println("Ngay Khong Duoc De Trong");
        }
    }
    @Override
    public String toString() {
        return "HangHoaSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhaSX=" + nhaSX + "]"+"Thue VAT" +this.VAT() +super.toString();
    }
    @Override
    public double VAT() {
        double thueVat = 0;
        thueVat = this.getDonGiaHH() * 0.1;
        return thueVat;
    }
    
    
}




