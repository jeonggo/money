
public class MainClass {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		  /*int money = 0;
        System.out.println("���� �ݾ�");
        System.out.println( money +"�� �ֽ��ϴ�.");
        System.out.println("���� �ȴ� 5õ�� �ֿ���.");
        money = money + 5000;
        System.out.println("���� �ݾ�");
        System.out.println( money +"�� �ֽ��ϴ�.");
        System.out.println("���� �ȴ� 3õ�� �ֿ���.");
        money = money + 3000;
        System.out.println("���� �ݾ�");
        System.out.println( money +"�� �ֽ��ϴ�.");
        System.out.println("���� �ȴ� 2õ�� �ֿ���.");
        money = money + 2000;
        System.out.println("���� �ݾ�");
        System.out.println( money +"�� �ֽ��ϴ�.");*/
        
        int money = 0;
        for (int i=1; i<=3; i++) {
                System.out.println("���� ����");
                System.out.println("2000���� �ֿ���");
                money = money + 2000;
                System.out.println(money + "�� �ֽ��ϴ�.");
        }
        
        if (money >= 5000) {
                System.out.println("���� ���� �� �ִ�.");
        }
        int a = 0;
        Myclass mc = new Myclass();
        money = mc.coin(money);
        money = mc.coin2(money);
        money = mc.coin3(money);
        System.out.println("���� " + money +"�� �ֽ��ϴ�.");


	}

}
