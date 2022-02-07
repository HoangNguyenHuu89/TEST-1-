/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Quadratic {

    public void quadratic(int a, int b, int c) {
        double delta = (double) b * b - (double) 4 * a * c;
        if (delta < 0) {
            System.out.println("Khong ton tai gia tri can delta");
        } else {
            System.out.print("Gia tri can delta la: ");
            System.out.println(Math.sqrt(delta));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so a:");
        int a = sc.nextInt();
        System.out.println("Nhap vao he so b:");
        int b = sc.nextInt();
        System.out.println("Nhap vao he so c:");
        int c = sc.nextInt();
        Quadratic q = new Quadratic();
        q.quadratic(a, b, c);

    }

}
