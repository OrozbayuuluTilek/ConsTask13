public class Class {
    private int number;
    private String name;
    private int[] array;
    public Class(int number,String name,int[] array) {
        this.number = number;
        this.name = name;
        this.array = array;



    }
 public int[] method(int[] array) {

     for (int i = 0; i < array.length; i++) {


     }
     return array;
 }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
