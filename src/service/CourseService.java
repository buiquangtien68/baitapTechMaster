package service;

import entities.Course;
import entities.OpeningScheduled;
import entities.TransactionUsersCourseOS;

import java.util.Map;

public class CourseService {
    public void printOpenScheduledCourse(Map<Integer, OpeningScheduled> openingScheduledMap, Map<Integer, TransactionUsersCourseOS> transactionUsersCourseOSMap, Map<Integer, Course> courseMap){
        for (Map.Entry<Integer,OpeningScheduled> openingScheduledEntry:openingScheduledMap.entrySet()){
            System.out.println(openingScheduledEntry);
            for (Map.Entry<Integer,TransactionUsersCourseOS> transactionUsersCourseOSEntry:transactionUsersCourseOSMap.entrySet()){
                if (transactionUsersCourseOSEntry.getValue().getOpeningScheduleId()==openingScheduledEntry.getKey()){
                    System.out.println(courseMap.get(transactionUsersCourseOSEntry.getValue().getCourseId()));
                }
            }
        }
    }
}
