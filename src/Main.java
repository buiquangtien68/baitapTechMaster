import entities.*;
import service.CourseService;
import service.TransactionService;
import service.UsersService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountBanking accountBanking1= new AccountBanking("TP Bank","123456789");
        AccountBanking accountBanking2= new AccountBanking("MB Bank","123456789");
        AccountBanking accountBanking3= new AccountBanking("MB Bank","234567891");
        AccountBanking accountBanking4= new AccountBanking("ACB Bank","123456789");
        AccountBanking accountBanking5= new AccountBanking("LienVietPost Bank","123456789");
        Map<Integer,AccountBanking> accountBankingMap = new HashMap<>();
        accountBankingMap.put(accountBanking1.getId(),accountBanking1);
        accountBankingMap.put(accountBanking2.getId(),accountBanking2);
        accountBankingMap.put(accountBanking3.getId(),accountBanking3);
        accountBankingMap.put(accountBanking4.getId(),accountBanking4);
        accountBankingMap.put(accountBanking5.getId(),accountBanking5);

        Role role1 = new Role("học sinh");
        Role role2 = new Role("giáo viên");
        Role role3 = new Role("admin");
        Map<Integer,Role> roleMap = new HashMap<>();
        roleMap.put(role1.getId(),role1);
        roleMap.put(role2.getId(),role2);
        roleMap.put(role3.getId(),role3);

        OpeningScheduled openingScheduled1 = new OpeningScheduled(LocalDate.of(2023,12,18),"123 To Huu",LocalDate.of(2023,12,20), LocalTime.of(9, 0));
        OpeningScheduled openingScheduled2 = new OpeningScheduled(LocalDate.of(2023,12,19),"456 Hai Ba Trung",LocalDate.of(2023,12,21), LocalTime.of(10,30));
        OpeningScheduled openingScheduled3 = new OpeningScheduled(LocalDate.of(2023,12,20),"789 Tran Dai Nghia",LocalDate.of(2023,12,22), LocalTime.of(13,45));
        OpeningScheduled openingScheduled4 = new OpeningScheduled(LocalDate.of(2023,12,21),"321 Pho Hue",LocalDate.of(2023,12,23), LocalTime.of(16,0));
        OpeningScheduled openingScheduled5 = new OpeningScheduled(LocalDate.of(2023,12,22),"654 Ba Trieu",LocalDate.of(2023,12,24), LocalTime.of(18,15));
        Map<Integer,OpeningScheduled> openingScheduledMap = new HashMap<>();
        openingScheduledMap.put(openingScheduled1.getId(),openingScheduled1);
        openingScheduledMap.put(openingScheduled2.getId(),openingScheduled2);
        openingScheduledMap.put(openingScheduled3.getId(),openingScheduled3);
        openingScheduledMap.put(openingScheduled4.getId(),openingScheduled4);
        openingScheduledMap.put(openingScheduled5.getId(),openingScheduled5);

        Course course1 = new Course("Course A","3 thang","This is course A",1000000,"offline",1);
        Course course2 = new Course("Course B","6 thang","This is course B",2000000,"offline",1);
        Course course3 = new Course("Course C","1 nam","This is course C",3000000,"online",0);
        Course course4 = new Course("Course D","2 nam","This is course D",4000000,"online",1);
        Course course5 = new Course("Course E","3 thang","This is course E",5000000,"online",0);
        Map<Integer,Course> courseMap = new HashMap<>();
        courseMap.put(course1.getId(),course1);
        courseMap.put(course2.getId(),course2);
        courseMap.put(course3.getId(),course3);
        courseMap.put(course4.getId(),course4);
        courseMap.put(course5.getId(),course5);

        TransactionHistory transactionHistory1 = new TransactionHistory("Hoan thanh");
        TransactionHistory transactionHistory2 = new TransactionHistory("Chua hoan thanh");
        TransactionHistory transactionHistory3 = new TransactionHistory("Chua hoan thanh");
        TransactionHistory transactionHistory4 = new TransactionHistory("Hoan thanh");
        TransactionHistory transactionHistory5 = new TransactionHistory("Hoan thanh");
        Map<Integer,TransactionHistory> transactionHistoryMap = new HashMap<>();
        transactionHistoryMap.put(transactionHistory1.getId(),transactionHistory1);
        transactionHistoryMap.put(transactionHistory2.getId(),transactionHistory2);
        transactionHistoryMap.put(transactionHistory3.getId(),transactionHistory3);
        transactionHistoryMap.put(transactionHistory4.getId(),transactionHistory4);
        transactionHistoryMap.put(transactionHistory5.getId(),transactionHistory5);

        Users users1 = new Users("John Doe","1234567890","johndoe@example.com",1,1);
        Users users2 = new Users("Jane Smith","9876543210","janesmith@example.com",2,2);
        Users users3 = new Users("Mike Johnson","5555555555","mikejohnson@example.com",1,3);
        Users users4 = new Users("Sarah Williams","1111111111","sarahwilliams@example.com",3,4);
        Users users5 = new Users("David Brown","9999999999","davidbrown@example.com",2,5);
        Map<Integer,Users> usersMap =new HashMap<>();
        usersMap.put(users1.getId(),users1);
        usersMap.put(users2.getId(),users2);
        usersMap.put(users3.getId(),users3);
        usersMap.put(users4.getId(),users4);
        usersMap.put(users5.getId(),users5);

        TransactionUsersCourseOS transactionUsersCourseOS1 = new TransactionUsersCourseOS(1,1,2,1);
        TransactionUsersCourseOS transactionUsersCourseOS2 = new TransactionUsersCourseOS(2,2,1,1);
        TransactionUsersCourseOS transactionUsersCourseOS3 = new TransactionUsersCourseOS(3,5,5,5);
        TransactionUsersCourseOS transactionUsersCourseOS4 = new TransactionUsersCourseOS(4,3,3,3);
        TransactionUsersCourseOS transactionUsersCourseOS5 = new TransactionUsersCourseOS(5,1,1,1);
        Map<Integer,TransactionUsersCourseOS> transactionUsersCourseOSMap = new HashMap<>();
        transactionUsersCourseOSMap.put(transactionUsersCourseOS1.getId(),transactionUsersCourseOS1);
        transactionUsersCourseOSMap.put(transactionUsersCourseOS2.getId(),transactionUsersCourseOS2);
        transactionUsersCourseOSMap.put(transactionUsersCourseOS3.getId(),transactionUsersCourseOS3);
        transactionUsersCourseOSMap.put(transactionUsersCourseOS4.getId(),transactionUsersCourseOS4);
        transactionUsersCourseOSMap.put(transactionUsersCourseOS5.getId(),transactionUsersCourseOS5);

        UsersService usersService=new UsersService();
        System.out.println("Thông tin user và acc ngân hàng:");
        usersService.findInfoUser(usersMap,accountBankingMap);
        System.out.println();
        System.out.println("Thông tin học viên đăng ký học onl:");
        usersService.findUserByTypeCourse(transactionUsersCourseOSMap,usersMap,courseMap,1,"online");
        System.out.println();
        CourseService courseService=new CourseService();
        System.out.println("Thông tin lịch học và lớp học:");
        courseService.printOpenScheduledCourse(openingScheduledMap,transactionUsersCourseOSMap,courseMap);
        System.out.println();
        TransactionService transactionService=new TransactionService();
        System.out.println("Lịch sử giảo dịch của học viên:");
        transactionService.printTransaction(transactionHistoryMap,usersMap,courseMap,transactionUsersCourseOSMap);

    }
}
