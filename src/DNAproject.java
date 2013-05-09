
public class DNAproject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length==10){
			char DNA_samples[][]=new char[][]{
					{'A','G','C','G','T','C','C','A','C','C'},
					{'A','A','T','T','C','G','C','G','T','A'},
					{'T','T','C','G','A','G','T','G','A','A'},
					{'G','G','A','C','A','T','G','C','C','G'},
					{'T','G','A','C','A','A','C','C','T','T'}
					};
			char DNA_cor[][]=new char[5][10];
			int point = 10;
			char correcter[]=new char[10];
			double DNA_point[]=new double[10];
			
			for (int i = 0; i < args.length; i++)
				correcter[i] = args[i].charAt(0);
					
			for (int i = 0; i < DNA_samples.length; i++) {
				for (int j = 0; j < args.length; j++) {
					if(DNA_samples[i][j]==correcter[j]){
						DNA_point[i]+=point;
						DNA_cor[i][j]='0';
					}
					else {
						DNA_cor[i][j]='X';
					}			
				}
			}
			
			for (int i = 0; i < DNA_samples.length; i++) {
				System.out.print("DNA 샘플 "+(i+1)+"의 일치표 : ");
				for(int j = 0; j < args.length; j++)
					System.out.print(DNA_cor[i][j]);
				System.out.println();
				System.out.println("일치율 : "+(DNA_point[i]+"%"));			
			}
		}
		else System.out.println("입력된 DNA 개수와 맞지 않습니다.");
		}

}
