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
public class BillCalculator {
    
        double calculatorBasicBill(double unit)
    {
        double charge;
        if(unit < 200)
        {
            charge = 1.20;
        }
        else  if(unit >=200 && unit < 400)
        {
            charge = 1.50;
        }
        else  if(unit >=400 && unit < 600)
        {
            charge = 1.80;
        }
        else
            charge = 2.00;
        return charge;
    }


    double calculateSurcharge(double basicBill)
    {
        if(basicBill > 400)
        {
            basicBill += basicBill * 15 / 100.0;
        }
        else
            return basicBill;

        return  basicBill;
    }


    double getTotalBill(double unit)
    {
        double total = calculatorBasicBill(unit);
        double surcharge = calculateSurcharge(unit);
        double bill = total * surcharge;

        if(bill <= 100)
            bill = 100;

        return  bill;
    }
}
