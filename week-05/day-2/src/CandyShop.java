import java.util.ArrayList;

public class CandyShop {

    public static ArrayList<Object> repairSweetList(ArrayList<Object> inputList){
        ArrayList<Object> resultList = new ArrayList<Object>();

        for (Object o : inputList) {
            if (o.equals(2)) {
                resultList.add("Croissant");
            } else if (o.equals(false)) {
                resultList.add("Ice cream");
            } else {
                resultList.add(o);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Cupcake");
        list.add(2);
        list.add("Brownie");
        list.add(false);

        // Accidentally we added "2" and "false" to the `list`
        // Your task is to change the "2" to "Croissant" and change the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the `list` as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(list));
    }
}
