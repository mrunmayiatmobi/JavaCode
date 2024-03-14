import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(17);
        list.add(14);
        list.add(156);
        list.add(1);

        System.out.println(list);

        //both integerList1 and integerList are alternative way to add new collection
        List<Integer> integerList1 = new ArrayList<>(list);
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(list);


        System.out.println(integerList1);
        System.out.println(integerList);

        //clear whole list
        integerList.clear();
        System.out.println(integerList);

        //Check value present or not
        boolean contains = integerList1.contains(12);
        System.out.println("list have 12 value in it:"+contains);

        //is all elements present
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        boolean done = set.containsAll(integerList);
        System.out.println("List have all elements:"+done);

        //find hashcode
        System.out.println(integerList.hashCode());
        System.out.println(list.hashCode());
        System.out.println(set.hashCode());

        //isEmpty
        System.out.println(set.isEmpty());


        //to create iterator object
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

        System.out.println();
        for (Integer integer : set) {
            System.out.print(integer+ " ");
        }

        set.remove(14);
        System.out.println(set);

        //retain All
        set.retainAll(list);
        System.out.println(set);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

}
