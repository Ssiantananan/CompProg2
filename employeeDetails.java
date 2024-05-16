/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp2.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ssianrosalejos
 */
public class employeeDetails {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/cp2/test/MotorPH Employee Data.csv";
    private static final int HEADER_ROWS = 1;
    private int ID;
    public String name;
    private String department;
    private int birthday;
    private String gender;
    private String email;
    
    public employeeDetails (int idNum) {
        ID = idNum;
    }
    
    public void add()  throws FileNotFoundException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new employee ID: ");
            int newId = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter new employee last name: ");
            String newLastName = scanner.nextLine();

            System.out.print("Enter new employee first name: ");
            String newFirstName = scanner.nextLine();

            System.out.print("Enter new employee birthday (mm/dd/yyyy): ");
            String newBirthday = scanner.nextLine();
            
            System.out.print("Enter new employee address (do not use \",\"): ");
            String newAddress = scanner.nextLine();
            newAddress = newAddress.replaceAll(",", "");
            
            System.out.print("Enter new employee phone: ");
            String newPhone = scanner.nextLine();
            
            System.out.print("Enter new employee SSS: ");
            String newSSS = scanner.nextLine();
            
            System.out.print("Enter new employee PhilHealth: ");
            String newPhilHealth = scanner.nextLine();
            
            System.out.print("Enter new employee TIN: ");
            String newTin = scanner.nextLine();
            
            System.out.print("Enter new employee Pag-Ibig: ");
            String newPagibig = scanner.nextLine();
            
            System.out.print("Enter new employee status (Regular or Probationary): ");
            String newStatus = scanner.nextLine();
            
            System.out.print("Enter new employee position: ");
            String newPosition = scanner.nextLine();
            
            System.out.print("Enter new employee supervisor: ");
            String newSupervisor = scanner.nextLine();
            //It is important for the user not to use comma (",") because we use it as divider of details
            System.out.print("Enter new employee basic salary (do not use \",\"): ");
            String newBasicSalary = scanner.nextLine();
            //In case the user enters a comma, we remove it here
            newBasicSalary = newBasicSalary.replaceAll(",", "");
            
            System.out.print("Enter new employee rice subsidy (do not use \",\"): ");
            String newRiceSubsidy = scanner.nextLine();
            newRiceSubsidy = newRiceSubsidy.replaceAll(",", "");
            
            System.out.print("Enter new employee phone allowance (do not use \",\"): ");
            String newPhoneAllowance = scanner.nextLine();
            newPhoneAllowance = newPhoneAllowance.replaceAll(",", "");
            
            System.out.print("Enter new employee clothing allowance (do not use \",\"): ");
            String newClothingAllowance = scanner.nextLine();
            newClothingAllowance = newClothingAllowance.replaceAll(",", "");
            double newSemiMonthlyRate = Double.parseDouble(newBasicSalary) / 2;
            double newHourlyRate = Double.parseDouble(newBasicSalary) / 21 / 8;
            String formattedHourlyRate = String.format("%.2f", newHourlyRate);

            writer.write(String.format("\n%d,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                newId, newLastName, newFirstName, newBirthday, newAddress, newPhone, newSSS, newPhilHealth,
                newTin, newPagibig, newStatus, newPosition, newSupervisor, newBasicSalary, newRiceSubsidy,
                newPhoneAllowance, newClothingAllowance, newSemiMonthlyRate, formattedHourlyRate));

            System.out.println("New employee added successfully!");

        } catch (IOException e) {
        } finally{
            employeeDetails.employeeManagementMenu();
        }
    }
    public void edit() throws FileNotFoundException {
        
    }
    public void delete() throws FileNotFoundException {
        
    }
    public void search(int EmpID) throws FileNotFoundException {
        ID = EmpID;
        String name;
        String position;
        String supervisor;
        String status;
        String birthday;
        String phone;
        
        System.out.println("search reached employeeDetails");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            for (int i = 0; i < HEADER_ROWS; i++) {
                reader.readLine();
            }
            String line;
            boolean found = false; 
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                if (Integer.parseInt(employeeData[0]) == EmpID) {
                    found = true;
                    name = (employeeData[1] + ", " + employeeData[2]);
                    position = (employeeData[11]);
                    supervisor = (employeeData[12]);
                    status = (employeeData[10]);
                    birthday = (employeeData[3]);
                    phone = (employeeData[5]);
                    System.out.println("search successful");
                    searchEmployee searchResult = new searchEmployee();
                    searchResult.searchResult(name, position, supervisor, status, birthday, phone);
               }
            }
             if (!found) { // Print message only if employee is not found
                 searchEmployee searchResult = new searchEmployee();
            JOptionPane.showMessageDialog(searchResult, "Employee not found. Please enter a valid Employee Number.", "Invalid EmpID", JOptionPane.ERROR_MESSAGE);
        }
        } catch (IOException e) {
            System.out.println("File not found.");
        } finally {
           
        }
    }
    
    
    //ADD EMPLOYEE
    
    
    //EMPLOYEE MANAGEMENT MENU
        public static void employeeManagementMenu() throws FileNotFoundException{
            System.out.println("Employee Management Menu");
            System.out.println("1. Quick View Employee Record");
            System.out.println("2. Add New Employee Details");
            System.out.println("3. Main Menu");
            Scanner scanner = new Scanner(System.in);
            int menuchoice = scanner.nextInt();
            scanner.nextLine();
            switch (menuchoice){
            case 1:
                //ASK FOR EMPLOYEE ID
                System.out.println("\nEnter your employee ID: ");

                int ID = scanner.nextInt();
                scanner.nextLine();
                    employeeDetails employee = new employeeDetails(ID); //instantiate employeeDetails
                //SEARCH SECTION
                    
                break;
            case 2:
                employeeDetails newEmployee = new employeeDetails(0); // Instantiate employeeDetails
                newEmployee.add(); // Call the add() method
            case 3:
                CP2Test cp2Test = new CP2Test();
            default:
                System.out.println("Invalid choice.");
                employeeManagementMenu();
                
            }
        }
   
}
