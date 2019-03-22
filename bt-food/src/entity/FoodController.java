package entity;

import java.util.Scanner;
import java.util.ArrayList;

public class FoodController {
    private ArrayList<Food> list = new ArrayList();
    void addFood(){
        Scanner aa = new Scanner(System.in);
        System.out.println("nhập mã food: ");
        String Mã = aa.nextLine();
        System.out.println("nhập tên food: ");
        String Tên = aa.nextLine();
        System.out.println("Mô tả ngắn: ");
        String Mô_tả_ngắn = aa.nextLine();
        System.out.println("Ngày tạo: ");
        String ngay_tao = aa.nextLine();
        System.out.println("Nhập giá: ");
        String Giá = aa.nextLine();
        Food food = new Food(Mã,Tên,Mô_tả_ngắn,ngay_tao,Giá);
        list.add(food);
    };

    void printList() {
        System.out.println("Mã food  |  Tên  |  Mô Tả  |  Nhập Giá  |  Ngày bán");
        for(int i = 0; i < list.size(); ++i) {
            Food food =  list.get(i);
            System.out.printf("%5s\t  %5s\t %8s\t %12s\t %7s\n ",
                    food.getId(),food.getName(),food.getPrice(), food.getPrice(),food.getCreatedate());
        }
    }
}
