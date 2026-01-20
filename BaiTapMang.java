package Lec6_array;

import java.util.Scanner;

public class BaiTapMang {

    static void nhapMang(int numbers[], int n, Scanner scanner) {
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();                 //Gán giá trị vào vị trí i của mảng
        }
    }

    static void hienThiMang(int numbers[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();                               //Xuống dòng sau khi hết mảng
    }

    static void daoNguocMang(int numbers[], int n) {
        for (int i = 0; i < n / 2; i++) {                   //Đổi chỗ đến giữa mảng, vì mỗi lần đổi là 2 phần tử
            int temp = numbers[i];                          //Biến tạm lưu phần tử đầu
            numbers[i] = numbers[n - 1 - i];                //Gán phần tử cuối vào vị trí đầu
            numbers[n - 1 - i] = temp;                      //Gán phần tử đầu vào vị trí cuối
        }
    }

    static void hienThiSoChan(int numbers[], int n) {
        System.out.print("Cac so chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {                      //Kiểm tra đk số chẵn, vì chia 2 dư 0
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    static int tongChiaHetCho3Va5(int numbers[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                sum += numbers[i];                          //Cộng phần tử đúng vào sum
            }
        }
        return sum;
    }

    static void sapXepMangTangDan(int numbers[], int n) {
        for (int i = 0; i < n - 1; i++) {                   //Giữ vị trí đang xét
            for (int j = i + 1; j < n; j++) {               //Duyệt từ phần tử sau i
                if (numbers[i] > numbers[j]) {              //Nếu phần tử trước lớn hơn phần tử sau thì đổi chỗ
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    static void sapXepMangGiamDan(int numbers[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] < numbers[j]) {              //Nếu phần tử nhỏ hơn phần tử sau thì đổi chỗ, phần tử sẽ giảm dần
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        int numbers[] = new int[n];
        nhapMang(numbers, n, scanner);

        System.out.print("Mang vua nhap: ");
        hienThiMang(numbers, n);

        daoNguocMang(numbers, n);
        System.out.print("Mang sau khi dao nguoc: ");
        hienThiMang(numbers, n);

        hienThiSoChan(numbers, n);

        int sum = tongChiaHetCho3Va5(numbers, n);
        System.out.println("Tong cac thanh phan chia het cho 3 va 5: " + sum);

        sapXepMangTangDan(numbers, n);
        System.out.print("Mang sap xep tang dan: ");
        hienThiMang(numbers, n);

        sapXepMangGiamDan(numbers, n);
        System.out.print("Mang sap xep giam dan: ");
        hienThiMang(numbers, n);

        scanner.close();
    }
}
