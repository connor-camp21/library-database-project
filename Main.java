/*
 * Name: Connor Campbell
 * Student ID: 3784002
 * Course: CS1083
 * Assignment 2
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        //List to store Fruits objects
        ArrayList<Fruit> items = new ArrayList<>();
        
        for(int i = 0; i < ItemInfo.NUMBER_OF_ITEMS;i++)
        {
            int weight = input.nextInt();
            int pricePerLb = input.nextInt();
            
            //Creates a new fruit and adds it to the list
            Fruit f = new Fruit(weight, pricePerLb);
            items.add(f);
        }
        
        //Sort the items by totalPrice
        Sorting<Fruit> sorter = new Sorting<>();
        sorter.selectionSort(items);
        
        //List to store jus tthe total prices
        ArrayList<Integer> totalPrices = new ArrayList<>();
        
        //Loops through the sorted items and prints the total prices
        for(int i = 0; i < items.size(); i++)
        {
            int price = items.get(i).getTotalPrice();
            totalPrices.add(price);
            System.out.print(price + " ");
        }
        System.out.println();
        
        //Random value between 1-50
        int randomValue = random.nextInt(50) + 1;
        
        //Searches for random value in total prices
        Searching<Integer> searcher = new Searching<>();
        int index = searcher.linearSearch(totalPrices, randomValue);
        
        //Prints the search result
        if(index != -1)
        {
            System.out.println(randomValue + " " + index);
        }
        else
        {
            System.out.println(randomValue + " Not found");
        }
    }
}