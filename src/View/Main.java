/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Library;
import Controller.SortProgramming;
import Model.Element;
/**
 *
 * @author huynh
 */
public class Main 
{
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 1000));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new SortProgramming(element).run();
    }
}