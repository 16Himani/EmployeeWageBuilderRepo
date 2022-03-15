package com.infogalaxy;

import java.sql.SQLOutput;
import java.util.Random;

public class EmployeeWageBuilder {
    int working_days = 0;
    int total_hr = 0;
    Random random = new Random();
    int total_wage = 0;
    public void empWageCalculations() {
        // UC-2 Employee Wage Calculation
        //UC-3 Employee Work Type
        //UC-5 Calculating Wages for a month
        //UC-1 Employee Attendance
        //UC-6 Calculate Assume 100 Hr & 20 Days

        while (working_days < Constants.TOTAL_WORKING_DAYS && total_hr <= Constants.TOTAL_WORKING_HR) {
            working_days++;
            System.out.println("Day :" + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");

            } else {
                System.out.println("Employee is Present");
                int empType = random.nextInt() % 2;
                if (empType < 0) {
                    empType = -empType;
                }
                //UC-4 Solving using Switch Case
                switch (empType) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part-Time");
                        total_wage = total_wage + (Constants.TOTAL_WORKING_HR * Constants.PART_TIME_HR);
                        total_hr = total_hr + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full-Time");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        total_hr = total_hr + Constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }

    public void showEmpWageCalculation() {

        System.out.println("Total_hr:" + total_hr);
        System.out.println("Total_Wage:" + total_wage);
    }


    public static void main(String[] args) {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.empWageCalculations();
        employeeWageBuilder.showEmpWageCalculation();
    }
}
