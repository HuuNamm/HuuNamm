/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKSBuild;

/**
 *
 * @author Namm
 */
public class Phong {
    
    // attributes( các thuộc tính )
    private String MAPHONG;
    private String TENPHONG;
    private String LOAIPHONG;
    private double GIAPHONG;
    private String CHUTHICH;
    private String TINHTRANG;
    private String MANV;
    private String MADV;

    //constructors ( phương thức khởi dựng)
    public Phong(String MAPHONG, String TENPHONG, String LOAIPHONG, double GIAPHONG, String CHUTHICH, String TINHTRANG, String MANV, String MADV) {
        this.MAPHONG = MAPHONG;
        this.TENPHONG = TENPHONG;
        this.LOAIPHONG = LOAIPHONG;
        this.GIAPHONG = GIAPHONG;
        this.CHUTHICH = CHUTHICH;
        this.TINHTRANG = TINHTRANG;
        this.MANV = MANV;
        this.MADV = MADV;
    }

    public Phong() {
    }

   
    // get-set
    public String getMAPHONG() {
        return MAPHONG;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public String getTENPHONG() {
        return TENPHONG;
    }

    public void setTENPHONG(String TENPHONG) {
        this.TENPHONG = TENPHONG;
    }

    public String getLOAIPHONG() {
        return LOAIPHONG;
    }

    public void setLOAIPHONG(String LOAIPHONG) {
        this.LOAIPHONG = LOAIPHONG;
    }

    public double getGIAPHONG() {
        return GIAPHONG;
    }

    public void setGIAPHONG(double GIAPHONG) {
        this.GIAPHONG = GIAPHONG;
    }

    public String getCHUTHICH() {
        return CHUTHICH;
    }

    public void setCHUTHICH(String CHUTHICH) {
        this.CHUTHICH = CHUTHICH;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    // in thông tin của phòng
    @Override
    public String toString() {
        return "Phong{" + "MAPHONG=" + MAPHONG + ", TENPHONG=" + TENPHONG + ", LOAIPHONG=" + LOAIPHONG + 
                ", GIAPHONG=" + GIAPHONG + ", CHUTHICH=" + CHUTHICH + ", TINHTRANG=" + TINHTRANG + ", MANV=" + MANV + ", MADV=" + MADV + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
