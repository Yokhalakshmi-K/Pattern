class HollowDiamond{
	public static void main(String[] args){
		int range=5;
		int n=2*range-1;
		
		for(int row=0;row<n;row++){
			int space = row < range ? range - row -1 : row - range +1;
			for(int col=0;col<n;col++){
				if(col==space || col== n-1-space)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
