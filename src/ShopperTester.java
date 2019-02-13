import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

public class ShopperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Shopper cameron = new Shopper("Cameron");

		ShopperHelper sh = new ShopperHelper();

		sh.insertShopper(cameron);

		List<Shopper> allShoppers = sh.showAllShoppers();
		for (Shopper a : allShoppers) {
			System.out.println(a.toString());
		}
	
		ListDetailsHelper ldh = new ListDetailsHelper();
		ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);

		ldh.insertNewListDetails(cameronList);
		
		List<ListDetails> allLists = ldh.getLists();
		for (ListDetails a : allLists) {
			System.out.println(a.toString());
		}
		 
		*/
		
		Shopper susan = new Shopper("Susan");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> susansItems = new ArrayList<ListItem>();
		susansItems.add(shampoo);
		susansItems.add(brush);
		
		ListDetails susansList = new ListDetails("Susan's ShoppingList", LocalDate.now(), susan);
		susansList.setListOfItems(susansItems);
		
		ldh.insertNewListDetails(susansList);
		
		
		List<ListDetails> allLists = ldh.getLists();
		for(ListDetails a: allLists) {
			System.out.println(a.toString());
		}
		

	}

}
