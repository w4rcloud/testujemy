package test;

public class ForEach {

    public static String makeShoppingList (String[] shoppingList){
        String list = "";
        for (String name : shoppingList) {
            list += name;
            list += ", ";

        }

        return list;
    }

    public static void main(String[] args) {
        String[] names = {"cheese", "bun", "ham"};
        String shoppingList = makeShoppingList(names);
        System.out.println(shoppingList);
    }
}

