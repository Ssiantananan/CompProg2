/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp2.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author ssianrosalejos
 */
public class Login {
    private int EmpID;
    private String PWord;
    private String result;
    private static final String LOGIN_PATH = System.getProperty("user.dir") + "/src/cp2/test/login.csv";
    private static final int HEADER_ROWS = 1;

public boolean verifyLogin(int empID, String password) {
        boolean loginSuccessful = false;
        try (BufferedReader br = new BufferedReader(new FileReader(LOGIN_PATH))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int storedEmpID = Integer.parseInt(data[0]);
                String storedPassword = data[1];

                // Check if the provided empID and password match with the stored values
                if (empID == storedEmpID && password.equals(storedPassword)) {
                    loginSuccessful = true;
                    break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace(); // Handle IOException or NumberFormatException as needed
        }
        
        return loginSuccessful;
    }

}
