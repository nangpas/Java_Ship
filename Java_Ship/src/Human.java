import java.awt.Image;

class Human {
	Image human_img; // �⺻ ��� �̹���
	Image cannonHuman_img; // ���� ��� �̹���
	
	int x,y; //(��ġ��)
	int position; //(���� �Ǵ� ����) 
	// - 0 :��under, 1 : center(����), 2 : top(�þ߱���), 3 : bottom(Ű����)
	
	int speed; //(�̵��ӵ�)
	boolean carryBomb; // ���� ���� ������ �ִ��� �ƴϸ� �Ȱ����� �ִ���
	
	int playStatus; // �÷��̾� ����
	// - move = 0, store = 1, shooting = 2, repair = 4, drive = 5
	
}
