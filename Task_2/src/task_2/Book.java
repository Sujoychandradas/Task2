/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author sujoy
 */
public class Book {
    String book_name, title_1,title_2,author,total_pages,price,publication;
    int edition;

    void showinfo()
    {
        System.out.println(book_name);
        System.out.println(title_1 + edition + title_2);
        System.out.println(author);
        System.out.println(total_pages);
        System.out.println("Prices: "+ price);
        System.out.println(publication);
        System.out.println();
    }
}