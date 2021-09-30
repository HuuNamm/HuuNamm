/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKSBuild;

import java.util.Date;

public class HoaDon {
    
    // attributes ( các thuôc tính)
    private String MAHD;
    private String MANV;
    private String MAPHONG;
    private Date NGAY;
    private double GIAHD;

    
      //constructors
    public HoaDon(String MAHD, String MANV, String MAPHONG, Date NGAY, double GIAHD) {
        this.MAHD = MAHD;
        this.MANV = MANV;
        this.MAPHONG = MAPHONG;
        this.NGAY = NGAY;
        this.GIAHD = GIAHD;
    }

    public HoaDon() {
    }

    // get- set
    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMAPHONG() {
        return MAPHONG;
    }

    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public Date getNGAY() {
        return NGAY;
    }

    public void setNGAY(Date NGAY) {
        this.NGAY = NGAY;
    }

    public double getGIAHD() {
        return GIAHD;
    }

    public void setGIAHD(double GIAHD) {
        this.GIAHD = GIAHD;
    }
 
     // in thông tin của hóa đơn khách sạn
    @Override
    public String toString() {
        return "HoaDon{" + "MAHD=" + MAHD + ", MANV=" + MANV + ", MAPHONG=" + MAPHONG + ", NGAY=" + NGAY + ", GIAHD=" + GIAHD + '}';
    }
    
    
    
    
}
