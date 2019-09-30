
public class Myclass {
	   
    public void coin() {
            System.out.println("1000원을 더했어요");                
    }
    public void coin2() {
            System.out.println("2000원을 더했어요");                
    }
    public void coin3() {
            System.out.println("3000원을 더했어요");                
    }

    public int coin(int money) {
            money = money + 1000;
            System.out.println("당신의 돈은 " + money);
            return money;
    }
    public int coin2(int money) {
            money = money + 2000;
            System.out.println("당신의 돈은 " + money);
            return money;
    }
    public int coin3(int money) {
            money = money + 3000;
            System.out.println("당신의 돈은 " + money);
            return money;
    }

}
