public class DNA {
	public static void main(String[] args) {
		char st[][] = {{'A', 'C', 'G', 'T', 'C', 'A', 'G', 'T', 'A', 'C'}, {'T', 'C', 'A', 'T', 'C', 'A', 'G', 'C', 'A', 'C'}, {'A', 'T', 'G', 'C', 'T', 'A', 'G', 'C', 'A', 'T'}, {'G', 'C', 'A', 'T', 'C', 'G', 'A', 'T', 'G', 'C'}, {'T', 'G', 'C', 'A', 'T', 'G', 'C', 'A', 'T', 'G'}};
		char a[] = new char[10];
		int count=0;
		if(args.length != 10){
			System.out.println("�������� ������ ���� �ʽ��ϴ�. 10���� �Է����ּ���.");
			return;//���α׷� ����
		}	
		for(int i=0; i<a.length; i++){
			a[i] = args[i].charAt(0);
		}	
		for(int i = 0; i <st.length; i++){
			count=0;
			System.out.print("��� "+(i+1)+"�� ������ �м�ǥ : ");
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
			System.out.println("��� "+(i+1)+"�� �����ڴ� "+(count*10)+"% ��ġ�մϴ�.");
			System.out.println();
		}
	}
}