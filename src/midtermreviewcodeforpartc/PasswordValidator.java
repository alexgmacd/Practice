/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Password validator has been removed from UnoOnline and delegated to
a specific class that handles password validation and can be used for other
classes.
UnoClass is now more cohesive.
Changes are now easier to make and code is more flexible and extensible.
*/
package midtermreviewcodeforpartc;

/**
 *
 * @author Alex
 */
public class PasswordValidator {
    
    boolean isValid(String password){
        int specialCharCount = 0;
        for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    specialCharCount++;
                }
            }
        return (specialCharCount>0 && password.length()>7);

    }
}
