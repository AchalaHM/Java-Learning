import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String []args){

        ArrayList<String> arrayList = new ArrayList<>();
        //add objects to Array List
        arrayList.add("Achala");
        arrayList.add("Vinuri");
        arrayList.add("Punsara");
        arrayList.add("Ridmika");
        System.out.println(arrayList);

        //add objects to Array List at particular index
        arrayList.add(2,"UCSC");
        System.out.println(arrayList);

        //add elements from another collection
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Dinith");
        arrayList1.add("Dinithi");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        //by mentioning index first we can add another collection to array list at specific index

        //get element by index
        String name = arrayList.get(0);
        System.out.println(name);

        //update element
        arrayList.set(2, "UCSC and SLIIT");
        System.out.println(arrayList);

        //remove one
        arrayList.remove(2);//we can remove item by use object s parameter instead of index
        System.out.println(arrayList);

        //remove all
        arrayList1.removeAll(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList);

        //remove according to the condition
        arrayList.removeIf(s -> s.startsWith("D"));
        System.out.println(arrayList);

        //check object in the kist
        System.out.println(arrayList.contains("Achala"));

        //get index of object
        System.out.println(arrayList.indexOf("Ridmika"));
        //Can get last index of specific element by lastIndexOf()
        //Can check Array List is empty by isEmpty()

        //get size
        System.out.println(arrayList.size());

        //Iterating elements for each
        for (String names :arrayList) {
            System.out.println(names);
        }

        //Iterating elemnts using Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
