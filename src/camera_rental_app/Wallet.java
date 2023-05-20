/* Project Details: CAMERA RENTAL APPLICATION
 * 		============================================
 * 		Package Name: camera_rental_app
 * 		=============================================
 * 		
 * 	Classes						File Names	
 * 	=================		======================================
 * 1. Camera     			-  	Camera.java
 * 2. Wallet				-	Wallet.java
 * 3. CameraRentalManager 	- 	CameraRentalManager.java
 * 4. CameraMain			-	CameraMain.java (contains main() method)
 *	==================================================================
 *	set username = admin, password = password
 */
//*********************************************************************//
package camera_rental_app;

public class Wallet  {
    private double balance;
    //Constructor - to store initial balance
    public Wallet(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    //deposit () to add amount to balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR. "+getBalance());
    }
    //deduct() to deduct amount from balance
    public void deduct(double amount) {
        balance -= amount;
    }
}
