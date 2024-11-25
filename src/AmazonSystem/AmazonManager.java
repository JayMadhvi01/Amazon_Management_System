package AmazonSystem;

import java.io.BufferedReader;
import java.io.FileReader;

public class AmazonManager {
public static void main(String[] args) {     
	System.out.println("===========================================================================");
	System.out.println("||  ****   ****        ****    ****  *****      ALGONQUIN COLLEGE        ||");
    System.out.println("|| **  ** **      **  **  **  **  ** **   **    COURSE: OOP/CST8152      ||");
    System.out.println("|| ****** **      **  **  **  **  ** *****         PROF: PAULO           ||");
    System.out.println("|| **  **  ****        ****    ****  **           TERM: FALL/2024        ||");
	System.out.println("===========================================================================");
    System.out.println("||                   [Menu A2 - Amazon Manager]                          ||"); 
	System.out.println("===========================================================================");
	System.out.println("||                                 || USER                               ||");
    System.out.println("||                                 || Credit Options.....................||");
    System.out.println("|| ADMIN                           ||  [F] Add credit to customer        ||");
    System.out.println("||                                 ||  [G] Show credit from customer     ||");
    System.out.println("|| Product Options.................||  Wishlist options..................||");
    System.out.println("||  [A] Load product list          ||  [H] Add product in wishlist       ||");
    System.out.println("||  [B] Show product list          ||  [I] Remove product from wishlist  ||");
    System.out.println("||  [C] Search Products            ||  [J] Show products from wishlist   ||");
    System.out.println("||                                 ||  Cart Options......................||");
    System.out.println("|| Customer Options................||  [K] Add product in cart           ||");
    System.out.println("||  [D] Add customer               ||  [L] Reomve product from cart      ||");
    System.out.println("||  [E] Show customers             ||  [M] Show products from cart       ||");
    System.out.println("||                                 ||  [N] Buy product from cart         ||");
    System.out.println("||                                 ||  Comment Options...................||");
    System.out.println("||.................................||  [O] Comment products bought       ||");
    System.out.println("||            [Q] Exit             ||  [P] List comments from products   ||");
	System.out.println("===========================================================================");
    System.out.println("Choose an option: ");
    
    /*public void loadProductList(String csvFile) throws AmazonException {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int currentLine = 0;
            while ((line = br.readLine()) != null) {
                String[] data = AmazonUtil.lineReader(line, currentLine);
                if (currentLine != 0) {
                    if (data.length < NUMCOLS)
                          continue;
                    int id = (int) AmazonUtil.convertStrToFloat(data[0]);
                    String name = data[1];
                    AmazonProductCategory apc = new AmazonProductCategory(data[2]);
                    AmazonProductSubCategory apsc = new AmazonProductSubCategory(data[3], apc);
                    String imageURL = data[4];
                    String link = data[5];
                    float rating = AmazonUtil.convertStrToFloat(data[6]);
                    int nRatings = (int) AmazonUtil.convertStrToFloat(data[7]);
       
                    float discountPrice = AmazonUtil.convertStrToFloat(data[8].substring(1));
                    float actualPrice = AmazonUtil.convertStrToFloat(data[9].substring(1));

                    AmazonProduct product = new AmazonProduct(id, name, apc, apsc, imageURL, link, rating, nRatings, discountPrice, actualPrice);
                    bestsellers.add(product);
                }
                currentLine++;
            }
        } catch (FileNotFoundException e) {
            throw new AmazonProductException("The file is not available/ File not Found: " + csvFile);
        } catch (IOException e) {
            throw new AmazonProductException("Can not read the file: " + e.getMessage());
        }*/
       
   
}
}