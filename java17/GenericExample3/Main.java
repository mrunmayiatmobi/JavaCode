package GenericExample3;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List <String> stringList = new ArrayList<>();
        stringList.add("Mrunmayi");
        stringList.add("sunil");
        stringList.add("dharmadhikari");

        List <Integer> integerList = new ArrayList<>();
        integerList.add(45);
        integerList.add(12);

        testList(stringList);
        testList(integerList);


    }
    public static void testList(List<?> list){
        for(var element : list){
            if(element instanceof String s){
                System.out.printf("String:"+ s.toUpperCase());
            }else if(element instanceof Integer i){
                System.out.println("Interger:"+i.floatValue());
            }
        }
    }
}

