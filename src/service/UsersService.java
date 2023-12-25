package service;

import entities.AccountBanking;
import entities.Course;
import entities.TransactionUsersCourseOS;
import entities.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UsersService {
    public void findInfoUser(Map<Integer, Users> usersMap, Map<Integer, AccountBanking> accountBankingMap){
        for (Map.Entry<Integer,Users> usersEntry : usersMap.entrySet()){
            System.out.println(usersEntry);
            System.out.println(accountBankingMap.get(usersEntry.getValue().getAccountBankingId()));
        }
    }

    public ArrayList<Integer> findUserByRole(Map<Integer, Users> usersMap, int roleId){
        ArrayList<Integer> usersIdList = new ArrayList<>();
        for (Map.Entry<Integer,Users> usersEntry : usersMap.entrySet()){
            if (usersEntry.getValue().getRoleId()==roleId){
                usersIdList.add(usersEntry.getKey());
            }
        }
        return usersIdList;
    }

    public ArrayList<Integer> findCourseByTypeCourse(Map<Integer, Course> courseMap, String typeCourse){
        ArrayList<Integer> courseIdList = new ArrayList<>();
        for (Map.Entry<Integer,Course> courseEntry : courseMap.entrySet()){
            if (courseEntry.getValue().getTypeCourse().equalsIgnoreCase(typeCourse)){
                courseIdList.add(courseEntry.getKey());
            }
        }
        return courseIdList;
    }

    public void findUserByTypeCourse(Map<Integer, TransactionUsersCourseOS> transactionUsersCourseOSMap,Map<Integer, Users> usersMap, Map<Integer, Course> courseMap, int roleId, String typeCourse ){
        ArrayList<Integer> userIdOnlineClass = new ArrayList<>();
        for (Map.Entry<Integer,TransactionUsersCourseOS> transactionUsersCourseOSEntry : transactionUsersCourseOSMap.entrySet()){
           for (Integer userId : findUserByRole(usersMap,roleId)){
               for (Integer courseId : findCourseByTypeCourse(courseMap,typeCourse)){
                   if (transactionUsersCourseOSEntry.getValue().getUsersId()==userId && transactionUsersCourseOSEntry.getValue().getCourseId()==courseId){
                       userIdOnlineClass.add(userId);
                   }
               }
           }
        }

        for (Integer userIdOnline : userIdOnlineClass){
            System.out.println(usersMap.get(userIdOnline));
        }
    }
}
