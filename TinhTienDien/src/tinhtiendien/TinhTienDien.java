/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtiendien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TinhTienDien {

    public void soDien(int soDien) {
        if (soDien > 0 && soDien <= 25) {
            int donGia = 1000;
            System.out.print("So tien dien phai tra: ");
            System.out.println(donGia * soDien);
        } else if (soDien > 25 && soDien <= 75) {
            int donGia = 1250;
            System.out.print("So tien dien phai tra: ");
            System.out.println(donGia * soDien);
        } else if (soDien > 75 && soDien <= 150) {
            int donGia = 1800;
            System.out.print("So tien dien phai tra: ");
            System.out.println(donGia * soDien);
        } else {
            int donGia = 2500;
            System.out.print("So tien dien phai tra: ");
            System.out.println(donGia * soDien);
        }
    }

    public static void main(String[] args) {
        TinhTienDien t = new TinhTienDien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so dien da tieu thu: ");
        int soDien = sc.nextInt();
        t.soDien(soDien);
    }

}
