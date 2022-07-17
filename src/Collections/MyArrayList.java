package Collections;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String str){
        array[size] = str;
        size++;
        if(size == array.length) {
            String[] newArray = new String[array.length*2];
            for(int i=0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    public void remove(int index) {
        if(index >= 0 && index < size){
            for(int i = index; i< size-1; i++){
                array[i] = array[i+1];
            }
            size--;
        }
    }
    public void remove(String str) {
        int index = -1;
        for(int i = 0; i < size; i++) {
            if(str.equals(array[i])) {
                index = i;
                break;
            }
        }
        if(index != 0){
            remove(index);
        }

    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if(index >= 0 && index < size){
            return array[index];
        }
        return "We cannot find elem";
    }
}
