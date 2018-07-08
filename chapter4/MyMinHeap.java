package chapter4;

import java.util.Arrays;

public class MyMinHeap {
	private int capacity=10;
	private int size=0;
	
	int[] items=new int[10];
	
	private int GetLeftChildIndex(int parentIndex) {return 2 * parentIndex + 1;}
	private int GetRightChildIndex(int parentIndex){return 2* parentIndex + 2;}
	private int GetParentIndex(int childIndex){return (childIndex-1)/2;}
	private boolean hasLeftChild(int index){return GetLeftChildIndex(index)<size;}
	private boolean hasRightChild(int index){return GetRightChildIndex(index)<size;}
	private boolean hasParent(int index){return GetParentIndex(index)>=0;}
	private int leftChild(int index){return items[GetLeftChildIndex(index)];}
	private int rightChild(int index){return items[GetRightChildIndex(index)];}
	private int parent(int index){return items[GetParentIndex(index)];}
	
	private void swap(int indexOne, int indexTwo){
		int temp = items[indexOne];
		items[indexOne]=items[indexTwo];
		items[indexTwo]=temp;
	}
	
	private void ensureExtraCapacity(){
		if (size==capacity){
			items=Arrays.copyOf(items, capacity*2);
			capacity*=2;
		}
	}
		
		public int peek(){
			if(size==0) throw new IllegalStateException();
			return items[0];
			
		}

		public int poll(){
			if(size==0) throw new IllegalStateException();
			int item=items[0];
			items[0]=items[size-1];
			size--;
			heapifyDown();
			return item;
		}

		public void add(int item){
			ensureExtraCapacity();
			items[size]=item;
			size++;
			heapifyUp();
		}

		public void heapifyUp(){
			int index = size - 1;
			while (hasParent(index) && parent(index) > items[index]){
				swap(GetParentIndex(index), index);
				index=GetParentIndex(index);
				
			}
		}

		public void heapifyDown(){
			int index=0;
			while(hasLeftChild(index)){
				int smallerChildIndex = GetLeftChildIndex(index);
				if(hasRightChild(index) && rightChild(index) > leftChild(index)){
					smallerChildIndex = GetRightChildIndex(index);
				}
				if(items[index] < items[smallerChildIndex]){
					break;
				}else{
					swap(index,smallerChildIndex);
				}
				
				index=smallerChildIndex;
			}
		}
		
}
	


