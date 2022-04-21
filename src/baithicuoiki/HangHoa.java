package baithicuoiki;



public abstract class HangHoa {
    private int maH, sLTHKK;
    private String tenHH;
    private double donGiaHH;

    public HangHoa(int sLTHKK, String tenHH, double donGiaHH) {
        this.maH = maH;
        this.sLTHKK = sLTHKK;
        this.tenHH = tenHH;
        this.donGiaHH = donGiaHH;
    }

    public HangHoa() {
    }

    
    public int getMaH() {
        return maH;
    }
    
    public void setMaH(int maH) {
        if(maH > 0){
            this.maH = maH;
        }
        else{
            System.out.println("Ban Nhap Sai Roi");
        }
    }

    public int getsLTonKhoH() {
        return sLTHKK;
    }
    
    public void setsLTonKhoH(int sLTonKhoH) {
        if(sLTonKhoH > 0){
            this.sLTHKK = sLTonKhoH;
        }
        else{
            System.out.println("So Luong Hang Ton Khong Dung");
        }
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        if(tenHH != null){
            this.tenHH = tenHH;
        }
    }
    
    public double getDonGiaHH() {
        return donGiaHH;
    }

    public void setDonGiaHH(double donGiaHH) {
        if(donGiaHH > 0){
            this.donGiaHH = donGiaHH;
        }
        else{
            System.out.println("Don Gia Khong Dung");
        }
    }

    @Override
    public String toString() {
        return "HangHoa [donGiaHH=" + donGiaHH + ", maH=" + maH + ", sLTonKhoH=" + sLTHKK + ", tenHH=" + tenHH + "]";
    }

}

