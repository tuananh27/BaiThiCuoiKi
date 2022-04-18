package baithicuoiki;

import java.util.Date;

public class DienMay extends HangHoa{
    private Date tgBH;
    private double congSuat;

    public DienMay() {
        
    }

    public DienMay(int maHang, String tenHang, int soLuongTon, double donGia, Date tgBH, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.tgBH = tgBH;
        this.congSuat = congSuat;
    }

    public Date getTgBH() {
        return tgBH;
    }
    public void setTgBH(Date tgBH) {
        if(tgBH != null){
            this.tgBH = tgBH;
        }else{
            System.out.println("Khong Duoc De Trong Thoi Gian Bao Hanh");
        }
    }
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public String toString() {
        return "DienMay "+super.toString()+"congSuat=" + congSuat + ", tgBH=" + tgBH + "]";
    }

    public void danhgia(){
        if(getSoLuongTon()<3){
            System.out.println("Hang ban duoc");
        }else{
            System.out.println("Hang khong ban duoc");
        }
    }
   

    

    

    

    
    
}
