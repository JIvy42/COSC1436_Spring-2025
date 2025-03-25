public class BudgetCalculator {  
public static void main(String[] args) {
 Constants
 public static final double SALARY = 3000.0;
 public static final double SAVINGS_PERCENT = 0.20;
public static final double RENT_PERCENT = 0.30;
public static final double GROCERIES_PERCENT = 0.15;
public static final double ENTERTAINMENT_PERCENT = 0.10;
 Variables
double monthlySalary = SALARY;
double savedAmount = monthlySalary * SAVINGS_PERCENT;
double rentAmount = monthlySalary * RENT_PERCENT;
double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
double remainingBalance = monthlySalary - totalExpenses;
 Display the results
System.out.println("Monthly Salary: $" + monthlySalary);
System.out.println("Amount Saved: $" + savedAmount);
System.out.println("Rent Amount: $" + rentAmount);
System.out.println("Groceries Amount: $" + groceriesAmount);
System.out.println("Entertainment Amount: $" + entertainmentAmount);
System.out.println("Total Expenses: $" + totalExpenses);
System.out.println("Remaining Balance: $" + remainingBalance);
    }
}


