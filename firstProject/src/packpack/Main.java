package packpack;

public class Main {
    public static void main(String[] args) {
        
        BoxGenerics<Boolean, String> boxG = new BoxGenerics<>(true, "NOMNOM");
        System.out.println(boxG.getItem());  
        boxG.setItem(false);
        System.out.println(boxG.getItem());  

        BoxGenerics<Long, String> boxG2 = new BoxGenerics<>(123L, "Long Item");
        System.out.println(boxG2.getItem());  
        System.out.println(boxG2.getItem2()); 

        BoxGenerics<Byte, Integer> boxG3 = new BoxGenerics<>((byte) 5, 100);
        System.out.println(boxG3.getItem());  
        System.out.println(boxG3.getItem2()); 
    }
}
