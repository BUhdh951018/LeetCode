package exercise;

/**
 * Name: Donghang He
 * Date: 2022/3/14 9:20 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public interface Calculator {
    PreviousCalculationToCareTaker backupLastCalculation();

    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
