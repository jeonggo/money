
public class MainClass {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		  /*int money = 0;
        System.out.println("현재 금액");
        System.out.println( money +"원 있습니다.");
        System.out.println("길을 걷다 5천원 주웠다.");
        money = money + 5000;
        System.out.println("현재 금액");
        System.out.println( money +"원 있습니다.");
        System.out.println("길을 걷다 3천원 주웠다.");
        money = money + 3000;
        System.out.println("현재 금액");
        System.out.println( money +"원 있습니다.");
        System.out.println("길을 걷다 2천원 주웠다.");
        money = money + 2000;
        System.out.println("현재 금액");
        System.out.println( money +"원 있습니다.");*/
        
        int money = 0;
        for (int i=1; i<=3; i++) {
                System.out.println("길을 간다");
                System.out.println("2000원을 주웠다");
                money = money + 2000;
                System.out.println(money + "원 있습니다.");
        }
        
        if (money >= 5000) {
                System.out.println("밥을 먹을 수 있다.");
        }
        int a = 0;
        Myclass mc = new Myclass();
        money = mc.coin(money);
        money = mc.coin2(money);
        money = mc.coin3(money);
        System.out.println("돈은 " + money +"원 있습니다.");


	}

}
