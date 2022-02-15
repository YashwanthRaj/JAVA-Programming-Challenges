public class SimpleCalculator {
    private double firstNumber = 0;
    private double secondNumber = 0;
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        double sum = firstNumber + secondNumber;
        return sum;
    }
    public double getSubtractionResult(){
        double sub = firstNumber - secondNumber;
        return sub;
    }
    public double getMultiplicationResult(){
        double mul = firstNumber * secondNumber;
        return mul;
    }
    public double getDivisionResult(){
        if(secondNumber!=0){
          double div = (firstNumber)/(secondNumber);
          return div;  
        } else{
            return 0.0;
        }
        
    }
}