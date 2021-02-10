/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation.ejbs;

import javax.ejb.Local;

/**
 *
 * @author opilane
 */
@Local
public interface CalculationSessionLocal {

    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    int div(int a, int b);

    int mod(int a, int b);
    
}
