import javax.swing.JOptionPane;
public class SalaryDialog {
    public static void main(String[] args) {
        String salaryString, dependentsString;
        double salary, monthlyPay;
        int dependents;
        final double HOURS_IN_MONTH = 120;
        salaryString = JOptionPane.showInputDialog(null, "Enter your weekly pay", "Wage dialog 1", JOptionPane.INFORMATION_MESSAGE);
        monthlyPay = Double.parseDouble(salaryString) * HOURS_IN_MONTH;
        dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        JOptionPane.showMessageDialog(null, "Monthly salary is $" + monthlyPay + "\nDeductions will be made for" + dependents + "dependents");


    }

    
}
