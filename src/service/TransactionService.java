package service;

import entities.Course;
import entities.TransactionHistory;
import entities.TransactionUsersCourseOS;
import entities.Users;

import java.util.Map;

public class TransactionService {
    public void printTransaction(Map<Integer, TransactionHistory> transactionHistoryMap, Map<Integer, Users> usersMap,Map<Integer, Course> courseMap, Map<Integer, TransactionUsersCourseOS> transactionUsersCourseOSMap){
        for (Map.Entry<Integer,TransactionUsersCourseOS> transactionUsersCourseOSEntry:transactionUsersCourseOSMap.entrySet()){
            System.out.println("Tên học viên:"+usersMap.get(transactionUsersCourseOSEntry.getValue().getUsersId()).getName());
            System.out.println("Tên khóa học:"+courseMap.get(transactionUsersCourseOSEntry.getValue().getCourseId()).getName());
            System.out.println("Thông tin giao dịch:"+transactionHistoryMap.get(transactionUsersCourseOSEntry.getValue().getTransactionHistoryId()));
            System.out.println();
        }
    }
}
