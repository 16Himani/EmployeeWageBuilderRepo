package com.infogalaxy;

import java.sql.SQLOutput;
import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        // UC-2 Employee Wage Calculation
        //UC-3 Employee Work Type
        //UC-5 Calculating Wages for a Month
        final int WAGE_PER_HR = 20;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        final int WORKING_DAYS = 20;
        int total_wage = 0;
        //UC-1 Employee Attendance

        Random random = new Random();
        for (int i = 0; i <= 20; i++) {
            System.out.println("Day " + i);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");

            } else {
                System.out.println("Employee is Present");
                int empType = random.nextInt() % 2;
                //UC-4 Convert Switch Case
                switch (empType) {
                    case 0:
                        System.out.println("Employee is Part-Time");
                        total_wage = (WAGE_PER_HR * PART_TIME_HR);
                        break;
                    case 1:
                        System.out.println("Employee is Full-Time");
                        total_wage = (WAGE_PER_HR * FULL_TIME_HR);
                        break;

                }

            }

        }


        total_wage = total_wage * WORKING_DAYS;
        System.out.println("Total Salary" + total_wage);

    }
}
