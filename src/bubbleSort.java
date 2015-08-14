//Duke Lee
//Bubble Sort implementation in Java

class bubbleSort {
	public static void main(String[] args){
		int[] a = {3,8,4,5,1,2,9,7,32,67,11,39,85,43,54,65};
		int b = (int) Math.pow(a.length, 2);
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a.length; j++) {
				if(j < a.length - 1) {
					if(a[j] > a[j+1]) {
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
