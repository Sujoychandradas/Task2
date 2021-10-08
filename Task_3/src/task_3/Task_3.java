/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3;

/**
 *
 * @author sujoy
 */
public class Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BillCalculator Finalcalculation = new BillCalculator();

//        Scanner sc = new Scanner(System.in);
//        double test = sc.nextDouble();

        System.out.println("Electricity bill for 25 units of usage: " + Finalcalculation.getTotalBill(25) + "tk");
        System.out.println("Electricity bill for 250 units of usage: " + Finalcalculation.getTotalBill(350) + "tk");
        System.out.println("Electricity bill for 812 units of usage: " + Finalcalculation.getTotalBill(812) + "tk");
    }
    
}
