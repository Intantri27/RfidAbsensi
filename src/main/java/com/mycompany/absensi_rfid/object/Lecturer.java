/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid.object;

/**
 *
 * @author MyBook Hype AMD
 */
public class Lecturer {
    private String nama;
    private String nip;
    private String username;
    private String password;
    private String status;
    
    public Lecturer(){
        
    }
    
    public Lecturer(String nama, String nip, String username, String password, String status) {
        this.nama = nama;
        this.nip = nip;
        this.username = username;
        this.password = password;
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Lecturer{" +
                "nama='" + nama + '\'' +
                ", nip='" + nip + '\'' +
                ", username='" + username + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
