import java.util.*;
void main() {
    ArrayList<ArrayList<Integer>> inventory = new ArrayList<ArrayList<Integer>>();
    inventory.add(new ArrayList<Integer>());
    inventory.add(new ArrayList<Integer>());
    inventory.add(new ArrayList<Integer>());

    inventory.get(0).add(5);
    inventory.get(0).add(12);
    inventory.get(0).add(3);

    inventory.get(1).add(8);
    inventory.get(1).add(2);
    inventory.get(1).add(15);

    inventory.get(2).add(1);
    inventory.get(2).add(20);
    inventory.get(2).add(4);

    LinkedList<Integer> l = new LinkedList<Integer>();
    for(int i = 0; i < inventory.size(); i++){
        for(int j = 0; j < inventory.get(i).size(); j++){
            if(inventory.get(i).get(j) < 5){
                l.add(inventory.get(i).get(j));
            }
        }
    }
    System.out.println("Original inventory ");
    for(int i = 0; i < inventory.size(); i++){
        System.out.print("section " + i + ": ");
        for(int j = 0; j < inventory.get(i).size();j++){
            System.out.print(" " + inventory.get(i).get(j));
        }
        System.out.println();
    }
    for(int i = 0; i < l.size(); i++){
        l.set(i,l.get(i)*2);
    }
    System.out.println(l);
    //System.out.println(inventory);
}
