package com.coboljunkie.umc.section_7.exercise_30;
/** This class contains a methods to perform mathematical operations with its parameters
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    /** Setter for first Number
     *
     * @param firstNumber first number
     */
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    /** Setter for second Number
     *
     * @param secondNumber second number
     */
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    /** Getter for first Number
     *
     * @return first Number
     */
    public double getFirstNumber(){
        return this.firstNumber;

    }

    /** Getter for Second Number
     *
     * @return second Number
     */
    public double getSecondNumber(){
        return this.secondNumber;

    }

    /** Adds first and second number
     *
     * @return result from addition
     */
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);

    }
    /** Subtracts second number from first
     *
     * @return result from substraction
     */
    public double getSubtractionResult(){
        return (this.firstNumber - this.secondNumber);
    }

    /** Multiplies the first number with the second
     *
     * @return result from multiplication
     */

    public double getMultiplicationResult(){
        return (this.firstNumber * this.secondNumber);
    }

    /** divides first number by the second number
     *
     * @return result of division
     */
    public double getDivisionResult(){
        if (this.secondNumber == (0)) {
            return(0);
        } else {
            return (this.firstNumber / this.secondNumber);
        }
    }
}
