package calculation.ejbs;

import javax.ejb.Stateless;

@Stateless
public class CalculationSession implements CalculationSessionLocal {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        try{
            return a / b;
        }catch (Exception e){
            return 0;
        }
      
    }

    @Override
    public int mod(int a, int b) {
        try{
            return a % b;
        }catch(Exception e){
            return 0;
        }
    }
    
    
}
