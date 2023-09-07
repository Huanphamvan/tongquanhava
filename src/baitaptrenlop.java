import java.util.Scanner;

public class baitaptrenlop {
    public static void main(String[] args) {
//        1. In ra Hello World
//        System.out.println("Hello World");
//        2. In ra Hello world, Hi Ae
//        System.out.println("Hello world, Hi Ae");
//        3. Nhập vào tên bạn, ví dụ NA => in ra ""Hello C06""?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập tên ban : ");
//        String name = sc.nextLine();
//        System.out.println(name+ " Xin chào C0723G1");

//        Kiểu dữ liệu:
//        1. Khai báo 1 biến kiểu int, in ra số đó.
//        int a =10 ;
//        System.out.println(a);

//        2. Nhập 1 biến kiểu int, in ra số đó.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyên : ");
//        int a = sc.nextInt();
//        System.out.println(a);

//        3. Nhập vào 2 biến kiểu int, in ra tổng, tích, hiệu, thương, số dư của 2 số đó.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyên a : ");
//        int a = sc.nextInt();
//        System.out.println("Xin mời nhập vào một số nguyên b : ");
//        int b = sc.nextInt();
//        System.out.println("Tổng của 2 số a và b là : " + (a+b));
//        System.out.println("Tích của 2 số a và b là : " + (a*b));
//        System.out.println("Hiệu của 2 số a và b là : " + (a-b));
//        System.out.println("Thương của 2 số a và b là : " + ((double)a+b));
//        System.out.println("Chia lay dư  của 2 số a và b là : " + (a%b));


//        4. Nhập vào tên, tuổi. In ra: ""Xin chào ..., tôi năm nay ..."""

//        Scanner nameInput = new Scanner(System.in);
//        Scanner ageInput = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào tên của bạn: ");
//        String name = nameInput.nextLine();
//        System.out.println("Xin mời nhập vào tuổi của bạn: ");
//        int age = ageInput.nextInt();
//        System.out.println("Xin chào " + name + ", tôi năm nay " + age);

//        Điều Kiện:
//        Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyên a : ");
//        int a = sc.nextInt();
//        System.out.println("Xin mời nhập vào một số nguyên b : ");
//        int b = sc.nextInt();
//
//        int div = a % b;
//        if (div == 0) {
//            System.out.println("a chia hết cho b");
//        } else {
//            System.out.println("a không chia hết cho b");
//        }

//        Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.

//        Scanner ageInput = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào tuổi của bạn: ");
//        int age = ageInput.nextInt();
//        if (age >15 ) {
//            System.out.println("học sinh này đủ điều kiện vào lớp 10 ");
//        } else {
//            System.out.println("học sinh này không đủ điều kiện vào lớp 10 ");
//        }

//        Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình
//        để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyên a : ");
//        int a = sc.nextInt();
//        if (a>0) {
//            System.out.println("Đây là số lớn hơn 0");
//        } else if ( a<0 ){
//            System.out.println("Đây là số nhỏ hơn 0");
//        } else
//            System.out.println("Đây là số  0");

//        Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyên a : ");
//        int a = sc.nextInt();
//        System.out.println("Xin mời nhập vào một số nguyên b : ");
//        int b = sc.nextInt();
//        System.out.println("Xin mời nhập vào một số nguyên c : ");
//        int c = sc.nextInt();
//        if (a>b) {
//            if (a>c) {
//                System.out.println( a+" là số lớn nhất");
//            } else
//            {
//                System.out.println( c+" là số lớn nhất");
//            }
//        } else
//        {
//           if (b>c) {
//               System.out.println( b+" là số lớn nhất");
//           } else
//           {System.out.println( c+" là số lớn nhất");
//           }
//
//        }
//

//        Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào điểm kiểm tra giữa kỳ : ");
//        int a = sc.nextInt();
//        System.out.println("Xin mời nhập vào điểm kiểm tra cuối kỳ : ");
//        int b = sc.nextInt();
//        double dtb = (double) (a + 2*b)/3;
//        if (dtb >8 && dtb <10) {
//            System.out.println("Xếp loại học sinh giỏi");
//        } else if (dtb >6.5 && dtb <=8) {
//            System.out.println("Xếp loại học sinh khá");
//        } else if (dtb >5.0 && dtb <=6.5 ) {
//            System.out.println("Xếp loại học sinh trung bình");
//        } else if ( dtb <=5 ) {
//            System.out.println("Xếp loại học sinh yếu");
//        } else {
//            System.out.println("Điểm bạn nhập ko đúng");
//        }

//        Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào doanh số bán hàng : ");
//        double sales = sc.nextDouble();
//        if (sales >= 5000000 && sales <10000000) {
//            System.out.println("Hoa hồng bạn nhận được là : " + 0.15*sales);
//        } else if (sales >= 10000000 && sales <25000000) {
//            System.out.println("Hoa hồng bạn nhận được là : " + 0.22*sales);
//        } else if (sales >= 25000000 && sales <50000000) {
//            System.out.println("Hoa hồng bạn nhận được là : " + 0.35*sales);
//        } else if (sales >= 50000000 ) {
//            System.out.println("Hoa hồng bạn nhận được là : " + 0.45*sales);
//        } else if (sales < 5000000 ) {
//            System.out.println("Bạn không nhan được hoa hồng, cố lên nhé " );
//        }

//        Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào số thời gian mà bạn đã sử dụng (phút) : ");
//        double sales = sc.nextDouble();
//        if (sales >= 1 && sales <60) {
//            System.out.println("Tiền cước điện thoại nhà bạn  là : " + 300*sales);
//        } else if (sales >= 61 && sales <300) {
//            System.out.println("Tiền cước điện thoại nhà bạn  là : " + 400*sales);
//        } else if (sales >= 300) {
//            System.out.println("Tiền cước điện thoại nhà bạn  là : " + 500*sales);
//        }


//        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào độ C :");
//        float degree = sc.nextFloat();
//        float doF = (float)degree*9/5 +32;
//        System.out.println("Độ F tương ứng với độ C mà bạn đã nhập vào là : " + doF);


//        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào mét :");
//        float length = sc.nextFloat();
//        float feet = length*3.2808f;
//        System.out.println("Khoảng cách tính bằng feet tương ứng với chiều dài mét mà bạn đã nhập vào là : " + feet);

//        Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào chiều dài cạnh hình vuông a :");
//        double a = sc.nextDouble();
//        double area = Math.pow(a,2);
//        System.out.println("Diện tích hình vuông với kích thước bạn vừa nhập là : " + area);


//        Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào chiều dài cạnh hình chũ nhật a :");
//        double a = sc.nextDouble();
//        System.out.println("Xin mời nhập vào chiều dài cạnh hình chũ nhật b :");
//        double b = sc.nextDouble();
//        double area = a*b;
//        System.out.println("Diện tích hình vuông với kích thước bạn vừa nhập là : " + area);

//        Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào chiều dài cạnh hình tam giác vuông a :");
//        double a = sc.nextDouble();
//        System.out.println("Xin mời nhập vào chiều dài cạnh còn lại  b :");
//        double b = sc.nextDouble();
//        double area = (double)(a*b)/2;
//        System.out.println("Diện tích hình vuông với kích thước bạn vừa nhập là : " + area);

//        Bài 6: Giải phương trình bậc 1.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào  a :");
//        double a = sc.nextDouble();
//        System.out.println("Xin mời nhập vào  b :");
//        double b = sc.nextDouble();
//        if (a == 0) {
//            if (b== 0) {
//                System.out.println("Phương trình có vô số nghiệm");
//            } else {
//                System.out.println("Phương trình có vô nghiệm");
//            }
//        } else {
//            System.out.println("Phương trình có một nghiệm là : " + ((double)-b/a));
//        }


//        Bài 7: Giải phương trình bậc 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào  a :");
//        double a = sc.nextDouble();
//        System.out.println("Xin mời nhập vào  b :");
//        double b = sc.nextDouble();
//        System.out.println("Xin mời nhập vào  c :");
//        double c = sc.nextDouble();
//        if (a==0) {
//            if (b == 0) {
//            if (c== 0) {
//                System.out.println("Phương trình có vô số nghiệm");
//            } else {
//                System.out.println("Phương trình có vô nghiệm");
//            }
//        } else {
//            System.out.println("Phương trình có một nghiệm là : " + ((double)-c/b));
//        }
//        } else {
//            double delta = Math.pow(b,2) -4*a*c;
//            if (delta<0) {System.out.println("Phương trình có vô nghiệm");
//            } else if (delta == 0) {
//                double x = (double)-b/2*a;
//                System.out.println("Phương trình có cặp nghiệm kép là : x1 = x2 = " +x);
//
//            }   else {
//                double x1 = (double)(-b + Math.sqrt(delta))/2*a;
//                double x2 = (double)(-b - Math.sqrt(delta))/2*a;
//                System.out.println("Phương trình có cặp nghiệm  là : x1 = " +x1);
//                System.out.println("Phương trình có cặp nghiệm  là : x2 = " +x2);
//            }
//
//        }

//        Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không.
//                Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Xin nhập vào độ tuổi mà bạn muốn kiểm tra :");
//        int age = input.nextInt();
//        if (age <0 || age >120) {
//            System.out.println("Đây không phải là tuổi của con người");
//        } else
//            System.out.println("Đây  là tuổi của con người");

//        Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác.
//        Điều kiện để a,b,c là cạnh của một tam giác là:
//        a,b,c > 0
//        a + b > c
//        b + c > a
//        a + c > b

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào chiều dài cạnh  a của tam giác (a>0) :");
//        double a = sc.nextDouble();
//        System.out.println("Xin mời nhập vào chiều dài cạnh  b của tam giác (b>0) :");
//        double b = sc.nextDouble();
//        System.out.println("Xin mời nhập vào chiều dài cạnh  c của tam giác (c>0) :");
//        double c = sc.nextDouble();
//
//        if (a + b > c && b + c > a && a + c > b) {
//            System.out.println("3 số thực (a,b,c) nhập vào  là cạnh của một tam giác");
//        } else {
//            System.out.println("3 số thực (a,b,c) nhập vào  không phải là cạnh của một tam giác");
//        }

//        Bài 10: Viết chương trình tính giá điện.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào số điện mà bạn đã sử dụng (KW) : ");
//        double sales = sc.nextDouble();
//        if (sales >= 1 && sales <100) {
//            System.out.println("Tiền cước điện  nhà bạn  là : " + 1200*sales);
//        } else if (sales >= 100 && sales <300) {
//            System.out.println("Tiền cước điện  nhà bạn  là : " + 1500*sales);
//        } else if (sales >= 300) {
//            System.out.println("Tiền cước điện  nhà bạn  là : " + 2000*sales);
//        }
//        Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào thu nhập cá nhân của bạn (lương tháng) : ");
//        double sales = sc.nextDouble();
//        if (sales >= 5000000 && sales <10000000) {
//            System.out.println("Thuế thu nhập cá nhân của bạn là : " + 0.05*sales);
//        } else if (sales >= 10000000 && sales <25000000) {
//            System.out.println("Thuế thu nhập cá nhân của bạn là  : " + 0.1*sales);
//        } else if (sales >= 25000000 && sales <50000000) {
//            System.out.println("Thuế thu nhập cá nhân của bạn là  : " + 0.15*sales);
//        } else if (sales >= 50000000 ) {
//            System.out.println("Thuế thu nhập cá nhân của bạn là  : " + 0.2*sales);
//        } else if (sales < 5000000 ) {
//            System.out.println("Bạn không phải đóng thuế, cứ phát huy nhé " );
//        }








    }
}
