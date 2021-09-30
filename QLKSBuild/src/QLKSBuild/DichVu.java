/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKSBuild;

public class DichVu {
    
    // attributes( các thuộc tính )
    private String MADV;
    private String TENNVL;
    private double GIADV;

   //constructors ( phương thức khởi dựng)
    public DichVu(String MADV, String TENNVL, double GIADV) {
        this.MADV = MADV;
        this.TENNVL = TENNVL;
        this.GIADV = GIADV;
    }

    public DichVu() {
    }
    
    // get-set
    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getTENNVL() {
        return TENNVL;
    }

    public void setTENNVL(String TENNVL) {
        this.TENNVL = TENNVL;
    }

    public double getGIADV() {
        return GIADV;
    }

    public void setGIADV(double GIADV) {
        this.GIADV = GIADV;
    }

    // hiển thị thông tin dịch vụ
    @Override
    public String toString() {
        return "DichVu{" + "MADV=" + MADV + ", TENNVL=" + TENNVL + ", GIADV=" + GIADV + '}';
    }
    
    
    
}
