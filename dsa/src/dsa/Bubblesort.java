package dsa;

public class Bubblesort {

	public static void main(String[] args) {
	int []a= {10,20,30,9,3,9,55,78,7};
	int n=a.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			
			System.out.println(a[i]);
		}
	}

	}

}
