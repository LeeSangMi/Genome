public class DNA {
	public static void main(String[] args) {
		char st[][] = {{'A', 'C', 'G', 'T', 'C', 'A', 'G', 'T', 'A', 'C'}, {'T', 'C', 'A', 'T', 'C', 'A', 'G', 'C', 'A', 'C'}, {'A', 'T', 'G', 'C', 'T', 'A', 'G', 'C', 'A', 'T'}, {'G', 'C', 'A', 'T', 'C', 'G', 'A', 'T', 'G', 'C'}, {'T', 'G', 'C', 'A', 'T', 'G', 'C', 'A', 'T', 'G'}};
		char a[] = new char[10];
		int count=0;
		if(args.length != 10){
			System.out.println("유전자의 갯수가 맞지 않습니다. 10개를 입력해주세요.");
			return;//프로그램 종료
		}	
		for(int i=0; i<a.length; i++){
			a[i] = args[i].charAt(0);
		}	
		for(int i = 0; i <st.length; i++){
			count=0;
			System.out.print("사람 "+(i+1)+"의 유전자 분석표 : ");
			for(int j = 0; j <a.length; j++){
			if(st[i][j] == a[j]) {			
				System.out.print("O ");
  				count++;
			}
			else {
				System.out.print("X ");
			}
			}
			System.out.println();
			System.out.println("사람 "+(i+1)+"의 유전자는 "+(count*10)+"% 일치합니다.");
			System.out.println();
		}
	}
}