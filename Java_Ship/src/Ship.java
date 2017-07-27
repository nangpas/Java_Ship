import java.awt.Image;

class Ship {
	Image outShip; // 배 외부 이미지
	Image inShip; // 배 내부 이미지
	
	int c;
	char name; // 배이름
	int level; // 배 상태
	int width, height; // 배 크기
	int damage; // 몸통 데미지
	int shipSpeed; // 배 이동속도
	int hp; // 체력
	int money; // 재화
	int x,y; // 전체 맵에서의 현재 위치
	
	// 포 관련 변수 값
	int connonSpeed; // 포탄 스피드
	int range; // 사거리
	int delay; // 연사 속도
	boolean storage[]; // 저장소 
	
}
