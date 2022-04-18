package baithicuoiki;

import java.util.Date;

public class SanhSu extends HangHoa {
    private Date nNK;
    private String nSX;

    public SanhSu() {
    }

    public SanhSu(int maHang, String tenHang, int soLuongTon, double donGia, Date nNK, String nSX) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nNK = nNK;
        this.nSX = nSX;
    }
    
    public Date getnNK() {
        return nNK;
    }

    public void setnNK(Date nNK) {
        this.nNK = nNK;
    }

    public String getnSX() {
        return nSX;
    }

    public void setnSX(String nSX) {
        this.nSX = nSX;
    }

    @Override
    public String toString() {
        return "SanhSu [nNK=" + nNK + ", nSX=" + nSX + "]";
    }

    
    
    
}
