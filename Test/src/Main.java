import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[100];
        int count = product.length;
        Scanner scanner = new Scanner(System.in);
        int opt;
        while(true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Tìm sản phẩm giá cao nhất và thấp nhất");
            System.out.println("3. Tìm thông tin sản phẩm");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    if(count > 100){
                        System.out.println("Cơ sở dữ liệu đã đầy.");
                    }else {
                        String chon;
                        do {
                            System.out.println("Nhập id :");
                            String id = scanner.nextLine();
                            System.out.println("Nhập name: ");
                            String name = scanner.nextLine();
                            System.out.println("Nhập price :");
                            double price = scanner.nextDouble();
                            System.out.println("Nhập quality: ");
                            int quanlity = scanner.nextInt();
                            product[count++] = new Product(id,name,price,quanlity);
                            System.out.println("Bạn có muốn tiếp tục nhập không??? (y/n)");
                            chon = scanner.nextLine();
                        } while (chon == "y");
                    }
                    break;
                case 2:
                    double max= product[0].price;
                    double min = product[0].price;
                    for (int i = 0; i <product.length ; i++) {
                        if (max < product[i].price){
                            max = product[i].price;
                        }
                        if (min > product[i].price){
                            min = product[i].price;
                        }
                    }
                    System.out.println("Sản phẩm có giá cao nhất là : " +max );
                    System.out.println("Sản phẩm có giá cao nhất là : " +max );
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}