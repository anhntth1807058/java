package entity;

import java.util.Scanner;
public class MenuCreator {
    public void createMenu() {
        FoodController foodController = new FoodController();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm món ăn. ");
            System.out.println("2. Hiển thị danh sách món ăn.  ");
            System.out.println("3. Thoát chương trình.  ");
            int chon = scanner.nextInt();
            switch (chon){
                case 1:
                    foodController.addFood();
                    System.out.println("Thêm food thành công.");
                    break;
                case 2:
                    foodController.printList();
                    break;
                case 3:
                    System.out.println("Xin hẹn gặp lại.");
                    System.exit(1);
                    break;
            }
        }
    }
}
