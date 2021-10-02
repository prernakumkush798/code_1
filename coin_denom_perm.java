package lecture_27;
//permutation ,where supply of each coin is infinite and unique coins are provided
public class coin_denom_perm {
	public static void main(String[] args) {
		int coin[]= {2,3,5,6};
		coin_den_perm(coin, 10,  "");
		
	}
	if(total_amount<0) {
		return;
	}
public static void coin_den_perm(int coin[],int total_amount,String ans) {
	if(total_amount==0) {
		System.out.println(ans);
		return;
	}
	
	for(int i=0;i<coin.length;i++) {
	coin_den_perm(coin, total_amount-coin[i], ans+coin[i]);
}}
}
