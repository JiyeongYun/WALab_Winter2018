package workbook.StepK;

public class K05 {

	/** ������ **/
	public K05() {
		start();
	}

	private void start() {
		UserInfo user = new UserInfo();

		System.out.print("�л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ");
		user.input();
		user.index = 1;

		System.out.println("========================");
		System.out.println("��ϵ� �л� ����� ������ �����ϴ�.");
		System.out.println("------------------------");
		System.out.println("��ȣ\t ���̵�\t ��й�ȣ");
		user.print(user.index);
	}
}
