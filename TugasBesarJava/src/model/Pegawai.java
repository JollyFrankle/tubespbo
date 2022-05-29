package model;

import java.net.SocketTimeoutException;

public class Pegawai {
    private String namaPegawai;
    private String idPegawai;
    private String tglLahir;
    private String noHandphonePegawai;
    private String jobDesc;

    public Pegawai(String namaPegawai, String idPegawai, String tglLahir, String noHandphonePegawai, String jobDesc){
        this.namaPegawai = namaPegawai;
        this.idPegawai = idPegawai;
        this.tglLahir = tglLahir;
        this.noHandphonePegawai = noHandphonePegawai;
        this.jobDesc = jobDesc;
    }
    
    public String getNama(){
        return namaPegawai;
    }
    
    public void setNama(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public String setidPegawai(){
        return idPegawai;
    }
    
    public void setidPegawai(String idPegawai){
        this.idPegawai = idPegawai;
    }
    
    public String gettglLahir(){
        return tglLahir;
    }
    
    public void settglLahir(String tglLahir){
        this.tglLahir = tglLahir;
    }
    
    public String sgetjobDesc(){
        return jobDesc;
    }
    
    public void setjobDesc(String jobDesc){
        this.jobDesc = jobDesc;
    }

    public void showDataPegawai(){
        System.out.println("Nama Pegawai: "+namaPegawai);
        System.out.println("ID Pegawai: "+idPegawai);
        System.out.println("Tanggal Lahir: "+tglLahir);
        System.out.println("No Handphone: "+noHandphonePegawai);
        System.out.println("Job Desc: "+jobDesc);
    }

    public void hitungGajiPegawai(){
        
    }
}
