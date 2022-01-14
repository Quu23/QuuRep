package mathmatics;

public class Calculation {
	
	/** 
	 * @param count (int)
	 * @return PI (double) 
	 * <p>円周率の近似値を返します。
	 * <p>実用的に使うには引数に500万以上の数字を指定する必要があります。
	 * <p>計算式はライプニッツの公式。
	 */
	public static double getPi(int count) {
	//if you want to use PI ,you have to set 5million	count
		double answer=0;	
		for(int i=0;i<count+1;i++) {
			answer += Math.pow(-1,i)/(2*i+1);
		}
		answer *= 4;
		
		return answer;
	}
	
	/**
	 * @return ramdom number(int 1~6)
	 * <P>さいころのように１から６までの数をランダムに返します。以下は10万回試した結果
	 * <p>1: 16.719%
	 * <p>2: 16.638%
	 * <p>3: 16.681%
	 * <p>4: 16.563%
	 * <p>5: 16.946%
	 * <p>6: 16.453%
	 * <p>int i=0;
		int[] count = new int[6];
		while(i<100000) {
			switch(Calculation.Dice()) {
				case 1:
					count[0]++;
					break;
				case 2:
					count[1]++;
					break;
				case 3:
					count[2]++;
					break;
				case 4:
					count[3]++;
					break;
				case 5:
					count[4]++;
					break;
				case 6:
					count[5]++;
					break;
			}
			i++;
		}
		System.out.println("1: "+((double)count[0]/i)*100+"%");
		System.out.println("2: "+((double)count[1]/i)*100+"%");
		System.out.println("3: "+((double)count[2]/i)*100+"%");
		System.out.println("4: "+((double)count[3]/i)*100+"%");
		System.out.println("5: "+((double)count[4]/i)*100+"%");
		System.out.println("6: "+((double)count[5]/i)*100+"%");
	 */
	public static int Dice() {
		return new java.util.Random().nextInt(6)+1;
	}
}
