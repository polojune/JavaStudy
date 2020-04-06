package coffeeshop;

import java.util.ArrayList;

import lombok.Data;

//å�� : �޴� ����
@Data
public class Menu {

	// �޴� �����۵�(�÷���)
	private ArrayList<MenuItem> menuItems;

	public Menu(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem �޴�����(String menuName) {
		for (MenuItem menuItem : menuItems) {
			if (menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		return null;
	}
}
