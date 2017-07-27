import java.awt.Image;

class Human {
	Image human_img; // 기본 사람 이미지
	Image cannonHuman_img; // 포든 사람 이미지
	
	int x,y; //(위치값)
	int position; //(갑판 또는 지하) 
	// - 0 :　under, 1 : center(대포), 2 : top(시야구경), 3 : bottom(키잡이)
	
	int speed; //(이동속도)
	boolean carryBomb; // 현재 포를 가지고 있는지 아니면 안가지고 있는지
	
	int playStatus; // 플레이어 상태
	// - move = 0, store = 1, shooting = 2, repair = 4, drive = 5
	
}
