package GenericList;

public class MyList <T> {

    private T[] myArray;
    private int lenght;
    
    public MyList() {
        this.myArray = (T[]) new Object[10];
        this.lenght = 0;
    }

    public MyList(int i){
        this.myArray = (T[]) new Object[i];
        this.lenght = 0;
    }

    private void increaseCapacity(){

        T[] newArray = (T[]) new Object[this.myArray.length *2];
        for(int i = 0 ; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }
        this.myArray = newArray;
    }

    public int size(){
        for(int i = 0; i < myArray.length; i++){
        if(myArray[i] == null){
            return i;
        }
       }
       return myArray.length;
    }

    public int getCapacity(){
        return this.myArray.length;
    }

    public void add(T data){
        if(this.size() == this.getCapacity()){  
            increaseCapacity();
        }
        this.myArray[this.size()] = data;
    }

    public void printArray(){
        for(T t : this.myArray){
            System.out.println(t);
        }
    }

    public T getIndex(int i){
        if(i < 0 || i > myArray.length){
            throw new IndexOutOfBoundsException("Geçersiz indis: " + i);
        }
        return this.myArray[i];
    }

    public void removeIndex(int index){
        for(int i = index; i < size()-1;i++){
            this.myArray[i] = this.myArray[i+1];
        }
        this.myArray[size()-1] = null;
    }

    public void set(int i, T data){

        if(i < 0 || i > myArray.length){
            throw new IndexOutOfBoundsException("Geçersiz indis: " + i);
        }
        myArray[i] = data;
    }

    public int indexOf(T data){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == data){
            return i;
            }
        }
        return -1;
    }
    
    public int lastIndexOf(T data){
        int index = -1;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == data){
            index = i;
            }
        }
        return index;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public Object[] toArray(){
        Object[] tempObject =new Object[size()];
        for (int i =0;i<size();i++){
            tempObject[i] = this.myArray[i];
        }
        return tempObject;
    }

    public void clear(){
        for (int i = 0; i < this.myArray.length; i++) {
            this.myArray[i] = null;
        }
    }
}
