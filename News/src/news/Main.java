/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<News> list = new ArrayList<>();
        int choise;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.out.print("Choise: ");
            choise = sc.nextInt();
            if (choise == 4) {
                System.out.println("Exit!");
                break;
            }
            switch (choise) {
                case 1:

                    System.out.println("Nhap vao Title: ");
                    String tle = sc.nextLine();
                    tle = sc.nextLine();
                    System.out.println("Nhap vao PublishDate: ");
                    String publishDate = sc.nextLine();

                    System.out.println("Nhap vao Author: ");
                    String author = sc.nextLine();

                    System.out.println("Nhap vao Content: ");
                    String content = sc.nextLine();

                    News n = new News(tle, publishDate, author, content);
                    System.out.println("Danh gia 1:");
                    int rateOne = sc.nextInt();
                    System.out.println("Danh gia 2:");
                    int rateTwo = sc.nextInt();
                    System.out.println("Danh gia 3:");
                    int rateThree = sc.nextInt();
                    n.rateList[0] = rateOne;
                    n.rateList[1] = rateTwo;
                    n.rateList[2] = rateThree;

                    list.add(n);
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).display();
                    }
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).calculate();
                        list.get(i).display();
                    }
                    break;
                default:
                    System.out.println("Xin chọn lại!");
                    break;
            }
        } while (choise != 0);

    }

    public static void showMenu() {
        System.out.println("+-------------------Menu------------------+");
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        System.out.println("+-------------------Menu------------------+");
    }
}
