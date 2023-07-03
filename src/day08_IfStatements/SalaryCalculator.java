package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
            weeklyHours = 45 ;
        double stateTaxRate = 6.5,
               federalTaxRate = 26.2;
        int salaryBeforeTax = hourlyRate * weeklyHours * 52 ;
        double stateTax = salaryBeforeTax * stateTaxRate /100 ,
               federalTax = salaryBeforeTax * federalTaxRate /100 ,
                totalTax = stateTax + federalTax ,
                salaryAfterTax = salaryBeforeTax - totalTax ;

                        System.out.println("Gross pay is : $ " + salaryBeforeTax );
        System.out.println("State tax : $ " + stateTax);
        System.out.println("Federal tax : $ " + federalTax);
        System.out.println("Total tax is : $ " + totalTax);
        System.out.println("Net income = $ " + salaryAfterTax);

        }
    }
