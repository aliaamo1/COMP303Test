package labtest01;
import java.util.Arrays;
/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	private static Item anItem = new Item("apple", 2, 200);
			
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 * * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public static void main(String[] pArgs)
	{
		Arrays.sort(ITEMS, Item.compareByPrice());
		Inventory inv = new Inventory("Provigo");
		inv.stock(ITEM_BUTTER, 1);
		inv.stock(ITEM_CEREAL, 12);
		inv.stock(ITEM_JAM, 1);
		inv.dispose(anItem, 2);
		
		
		for( Item item : ITEMS )
		{
			System.out.println(item.getName());
		}
	}
}
