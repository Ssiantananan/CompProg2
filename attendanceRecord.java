/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp2.test;

/**
 *
 * @author ssianrosalejos
 */
public class attendanceRecord {
    public int timeIn;
    public int timeOut;
    public int date;
    public int ID;
    
    //temporary computation so we do not get error
    float weeklyHours = timeOut - timeIn;
    float monthlyHours = timeOut - timeIn;
    
    public int clockIn(){
        return timeIn;
    }
    public int clockOut(){
        return timeOut;
    }
    public float computeWeeklyHours(){
        return weeklyHours;
    }
    public float computeMonthlyHours(){
        return monthlyHours;
    }
    
    
}
