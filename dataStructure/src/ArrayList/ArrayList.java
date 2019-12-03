package ArrayList;

public class ArrayList {
	private int size = 0; // 리스트에 몇개의 값이 있는지
	private Object[] elementData = new Object[100]; // 리스트 최대 수용 개수 100
	public boolean addFirst(Object element){
		return add(0,element);
	}
	public boolean addLast(Object element){
		elementData[size] = element;
		size++;
		return true;
	}
	public boolean add(int index, Object element){
		for(int i = size -1;i >= index; i--){
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}
	public Object removeFirst(){
	    return remove(0);
	}
	 
	public Object removeLast(){
	    return remove(size-1);
	}
	public Object remove(int index){
		Object removed = elementData[index];
		for(int i=index; i<size-1; i++){
			elementData[i] = elementData[i+1];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	//toString이라는 이름의 메소드 호출
	public Object get(int index){
		return elementData[index];
	}
	public String toString(){
		String str = "[";
		for (int i=0; i<size; i++){
			str += elementData[i];
			if(i<size-1){
			str += ",";
			}
		}
		return str+ "]";
	}
	public int size(){
		return size;
	}
	public Object indexOf(Object o){
		for(int i=0;i<size-1;i++){
			if(elementData[i]==o){
				return i;
			}
		}
		return -1;
	}
	
	
}
