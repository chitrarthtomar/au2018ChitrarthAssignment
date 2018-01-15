

public class GenericsTest<E>  {

private Object[] array;
public static final int DEFAULT_SIZE = 20;
private int size = 0;

public GenericsTest(){
    this(DEFAULT_SIZE);
}

public GenericsTest(int size){
    array = new Object[size];
}

public void add(E element){
    checkSize();
    array[size++] = element;
}

public E remove(int index){
    if(index>=size || index < 0 ){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    array[index] = null;
    --size;
    compress();
    return element;
}

public E get(int index){
    if(index > size){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    return element;
}

private void checkSize(){
    if(size < array.length){ return;}
    resize();
}

public int getSize(){
    return this.size;
}



private void resize(){
    Object[] temp = new Object[array.length*2];
    copy(array,temp);
    array = temp;
}

private void copy(Object[] src, Object[] dest){
    if(dest.length< src.length){throw new RuntimeException(src+ " cannot be copied into "+dest);}
    for(int i=0;i<src.length; i++){
        dest[i] = src[i];
    }
}

private void compress(){
    int skipCount =0;
    for(int i=0;i < size && i<array.length; i++){
        if(array[i]==null){
            ++skipCount;                
        }
        array[i]=array[i+skipCount];
    }
}

public static void main(String[] args) {
	GenericsTest<Integer> A =  new GenericsTest<Integer>();
	A.add(14);
	A.add(34);
	A.add(4);
	A.add(60);
	A.remove(4);
	System.out.println(A.get(0)+" "+A.get(1)+" "+A.get(2));
}

}

