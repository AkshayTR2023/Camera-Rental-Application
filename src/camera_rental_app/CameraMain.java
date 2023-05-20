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
public class CameraMain {
    public static void main(String[] args) {
        CameraRentalManager manager = new CameraRentalManager();
        manager.start();
    }
}