package lecture_27;

public class coin_den_wrt_box {
	public static void main(String[] args) {
		int coin[] = { 2, 3, 5, 6 };
        coin_den_wrt_box(coin, 0, 10, "");
	}

public static void coin_den_wrt_box(int []coin,int index,int amount,String ans ) {
	if(amount==0) {
		System.out.println(ans);
		return;
	}
	if(amount<0 || index==coin.length) {
		return;
	}
	
	coin_den_wrt_box(coin, index, amount-coin[index],ans+coin[index]);//select-->as we have selected that coin we need not to got to next coin
	//bco we are having infinite unique coins in this case
	
	
}
}


