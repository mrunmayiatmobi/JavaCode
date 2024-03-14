package GenericsExample3;

public class Main {
    public static void main(String[] args) {
        Integer five =5;
        Integer [] others = {0,5,10,-50,50};

        for(Integer i : others){
            int value = five.compareTo(i);
            String result= (value==0?"==":value<0?"<":">");
            System.out.printf("%d %s %d : CompareTo= %d %n",five,result
                    ,i,value);
        }
    }
}
