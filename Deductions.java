/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp2.test;

/**
 *
 * @author ssianrosalejos
 */
public class Deductions {
    public float IncomeTax;
    public float PhilhealthDeduction;
    public float PagibigDeduction;
    public float SSSDeduction;
    
    //temporary computation to avoid errors
    float totalDeductions = IncomeTax + PhilhealthDeduction + PagibigDeduction + SSSDeduction;
    
    public float calculateDeductions(){
        return totalDeductions;
    }
}
