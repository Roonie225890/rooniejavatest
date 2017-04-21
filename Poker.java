package athome;

import java.util.Arrays;

public class Poker {

	public static void main(String[] args) {
			long begin = System.currentTimeMillis();
			//�~�P
			int[] poker = new int[52]; //0,0,...0
			int rand;
			boolean isOK;
			for (int i = 0; i<poker.length;i++){
				
				do {
					rand = (int)(Math.random()*poker.length);
					//�ˬd����
					isOK = true;
					for (int j=0;j<i;j++){
						if (poker[j]==rand){
							isOK = false;
							break;
						}
					}
				}while (!isOK);
				poker[i] = rand;
				//System.out.println(poker[i]);
				
			}
			//System.out.println(System.currentTimeMillis()-begin);
			System.out.println("-------");
			//�o�P  =>�|�Ӫ��a
			int[][] player = new int[4][13];
			for (int i = 0; i<poker.length; i++){
				player[i%4][i/4] = poker[i];
			}
			//�z�Q => �u�P
			String[] suit = {"�®�","����","���","����"};
			String[] value = {"A ","2 ","3 ","4 ",
							"5 ","6 ","7 ","8 ","9 ",
							"10","J ","Q ","K "};
			for(int[] cards : player){
				Arrays.sort(cards);
					for (int card : cards){
					System.out.println(suit[card/13] +
									   value[card%13] + " ");
					
				}
				System.out.println();
			}
	}

}
