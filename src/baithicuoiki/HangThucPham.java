package baithicuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date ngaySanXuat, ngayHetHan;
    private String nhaCungCap;
 
    public HangThucPham() {
    }

    public HangThucPham(int maHang, String tenHang, int soLuongTon, double donGia, Date nSanXuat, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = nSanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public Date getnSanXuat() {
        return ngaySanXuat;
    }

    public void setnSanXuat(Date nSanXuat) {
        this.ngaySanXuat = nSanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan != null){
            if(ngayHetHan.after(this.ngaySanXuat))
                this.ngayHetHan = ngayHetHan;
        }else{
            System.out.println("Ngay Het Han Phai Sau Ngay San Xuat");
            this.ngayHetHan = new Date();
        }
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = sf.format(ngayHetHan);
        String str2 = sf.format(ngaySanXuat);
        return "HangThucPham [ngayHetHan=" + str1 + ", ngaySanXuat=" + str2 + ", nhaCungCap=" + nhaCungCap
                + "]" + super.toString();
    }

   



    


}