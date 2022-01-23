package sharpieSet;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {

    private ArrayList<Sharpie> sharpieSet;

    public void add(Sharpie sharpie) {
        sharpieSet.add(sharpie);
    }

    public int countUsable() {
        int temp = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).getInkAmount() > 0) {
                temp++;
            }
        }
        return temp;
    }

    public void removeTrash() {
        List<Integer> toRemove = new ArrayList<>();

        for (int i = (sharpieSet.size() - 1); i >= 0; i--) {

            if (sharpieSet.get(i).getInkAmount() <= 0) {
                toRemove.add(i);
            }
        }

        for (int i = 0; i < toRemove.size(); i++) {
           int temp = toRemove.get(i);
            sharpieSet.remove(temp);
        }
    }

    public SharpieSet() {
        sharpieSet = new ArrayList<>();
    }

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie(50, "white");
        Sharpie sharpie2 = new Sharpie(50, "white");
        Sharpie sharpie3 = new Sharpie(50, "white");
        Sharpie sharpie4 = new Sharpie(50, "white");
        Sharpie sharpie5 = new Sharpie(50, "white");

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(sharpie1);
        sharpieSet.add(sharpie2);
        sharpieSet.add(sharpie3);
        sharpieSet.add(sharpie4);
        sharpieSet.add(sharpie5);
        sharpie5.use();

        for (int i = 0; i < 10; i++) {
            sharpie1.use();
            sharpie3.use();
        }

        for (int i = 0; i < sharpieSet.sharpieSet.size(); i++) {
            System.out.println(sharpieSet.sharpieSet.get(i).getInkAmount());
        }

        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println();

        for (int i = 0; i < sharpieSet.sharpieSet.size(); i++) {
            System.out.println(sharpieSet.sharpieSet.get(i).getInkAmount());
        }



    }
}
