
public record GroceryItem(String name,String type,int count){
    public GroceryItem(String name , String type){
        this(name,type,1);
    }
    public String toString(){
        return String.format("%d %s in %s",count,name,type);
    }
}
