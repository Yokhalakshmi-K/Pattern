public class Pattern7{
	public static void main(String[] args){
		int n=5;
		int mid=n/2;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==mid || j== mid)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}
