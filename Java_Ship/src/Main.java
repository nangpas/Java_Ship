import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main extends JFrame implements Runnable {
	Graphics ship;
	Image buffimg;
	Thread th;
	int count =0;
	int frame_X=1300;
	int frame_Y=700;
	int f_width  =  4000;
	int f_height =  3000;
	
	Toolkit tk = Toolkit.getDefaultToolkit(); // 이미 만들어진 객체(이미지 관련)

	Main() {
		setTitle("Battle_Ship_surviver");
		setSize(frame_X, frame_Y);
		
		Dimension screen = tk.getScreenSize();

		int xpos = (int) (screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
		setVisible(true);
		
	}
	@Override
	public void run() {
		while (true) {

			try {
				
				repaint();
				Thread.sleep(20);
				count++;

			} catch (Exception e) {
			}
		}	
	}

	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th = new Thread(this);
		th.start();
	}
	public void paint(Graphics g) {
		buffimg = createImage(f_width, f_height);

		ship = buffimg.getGraphics();
		
	}

	

	public static void main(String[] args) {

		Main m = new Main();

	}
	
}
