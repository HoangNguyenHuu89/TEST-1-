/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author admin
 */
public class Square {

    private float kichThuocCanh;

    public Square(float kichThuocCanh) {
        this.kichThuocCanh = kichThuocCanh;
    }

    public void hienThi() {
        System.out.println("Kich thuoc canh: " + kichThuocCanh);
    }

    public void tinhChuVi() {
        System.out.println("Chu vi la: " + 4 * kichThuocCanh);
    }

    public void tinhDienTich() {
        System.out.println("Dien tich la: " + kichThuocCanh * kichThuocCanh);
    }

}
