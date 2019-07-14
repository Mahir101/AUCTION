package dev.FIRSTGAME;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import dev.FIRSTGAME.Display.Display;
import dev.FIRSTGAME.Display.GameState;
import dev.FIRSTGAME.gfx.imageload;
public class Game implements Runnable {
	private int counter = 0, amount = 100000, b = 0, thispl = 0, cricket = 0, foot = 0, cin = 0, gone = 0,stopper=0;
	public static String player1 = "Player 1", player2 = "Player 2";
	private boolean runframe = true;
	private Display dis;
	public String title;
	public int widght, height;
	private Thread tread;
	private BufferStrategy bs;
	private Graphics g;
	private boolean running = false;
	// private BufferedImage testimage;
	private BufferedImage t4;
	private BufferedImage t,ps;
	private BufferedImage tx;
	private BufferedImage iconimg;
	private Football football;
	private Cinema cinema;
	private int rem1 = 10000000, nothing1 = 0, nothing2 = 0;
	static float point1 = 0;
	private int rem2 = 10000000;
	static float point2 = 0, f;
	// private spritesheet sheet1;
	private Cricket pl;
	public State gamestat;
	public State mainmen;
	public Connector c;
	public State set;
	///private highscores hs;
	public State Option;
	public State ins;
	public State result;
	private int cnt = 0;
	private MouseManager mouseManager;
	private Points po;
	private KeyManager keyManager;
	private Bid bid;
	private Number num;
	private Deck deck;
	File clap = new File("backsound.wav");
	File clap2 = new File("Horn blast.wav");
	File clap3 = new File("Winner.wav");
	private Music ms;
    private JFrame frame;
    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JRadioButton on ;
    private JRadioButton off;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;
    private ButtonGroup bg;
    private Save s;
    private boolean sound=true,bool=true;;

	public Game(String s, int h, int w) {
		widght = w;
		height = h;
		title = s;
		if(sound)
			Music.musi(clap);
	}

	private void init() {
		//hs=new highscores();
	    s=new Save();
		dis = new Display(title, widght, height);
		t = imageload.loadimage("/texture/power button.jpg");
		t4 = imageload.loadimage("/texture/power off.jpg");
		ps = imageload.loadimage("/texture/point shower.jpg");
		tx=imageload.loadimage("/texture/show.jpg");
		iconimg = imageload.loadimage("/texture/ico.jpg");
		gamestat = new GameState();
		mainmen = new MainMenu();
		set = new Settings();
		Option = new Option();
		ins = new Instructions();
		mouseManager = new MouseManager();
		keyManager = new KeyManager();
		po = new Points();
		bid = new Bid();
		num = new Number();
		cinema = new Cinema();
		football = new Football();
		result = new Result();
		State.setState(mainmen);
		dis.getFrame().addMouseListener(mouseManager);
		dis.getFrame().addMouseMotionListener(mouseManager);
		dis.getCanvas().addMouseListener(mouseManager);
		dis.getCanvas().addMouseMotionListener(mouseManager);
		dis.getFrame().addKeyListener(keyManager);
		dis.getCanvas().addKeyListener(keyManager);
	}

	private void tick() {
		keyManager.tick();
		if (State.getState() != null)
			State.getState().tick();
	}

	private void tender() throws InterruptedException {
		bs = dis.getCanvas().getBufferStrategy();
		if (bs == null) {
			dis.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, widght, height);
		// mainmenu
		//System.out.println(mouseManager.getMouseX() + " " + mouseManager.getMouseY());
		if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 80 && mouseManager.getMouseY() <= 180 && State.getState() == mainmen) {
			State.setState(Option);
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 280 && mouseManager.getMouseY() <= 380 && State.getState() == mainmen)
			State.setState(set);
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 680 && mouseManager.getMouseY() <= 780 && State.getState() == mainmen)
			System.exit(0);
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 480 && mouseManager.getMouseY() <= 580 && State.getState() == mainmen)
			State.setState(ins);
		// result
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 680 && mouseManager.getMouseY() <= 780 && State.getState() == result) {
			System.exit(0);
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 480 && mouseManager.getMouseY() <= 580 && State.getState() == result) {
				State.setState(mainmen);//http://org.eclipse.ui.intro/execute?command=org.eclipse.ui.newWizard%28newWizardId%3Dorg.eclipse.pde.ui.NewProjectWizard%29&standby=launchbar
			runframe=true;
			init();
			counter = 0;
			amount = 100000;
			b = 0;
			thispl = 0;
			cricket = 0;
			foot = 0;
			cin = 0;
			gone = 0;
			 player1 = "Player 1";
			player2 = "Player 2";
			 rem1 = 10000000;
			 nothing1 = 0;
			 nothing2 = 0;
			 point1 = 0;
				rem2 = 10000000;
				 point2 = 0;
		}
		// instruction
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 550 && mouseManager.getMouseX() <= 750
				&& mouseManager.getMouseY() >= 680 && mouseManager.getMouseY() <= 780 && State.getState() == ins) {
			State.setState(mainmen);
			runframe=true;
		}
		//highscores
		 else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 550 && mouseManager.getMouseX() <= 750
					&& mouseManager.getMouseY() >= 580 && mouseManager.getMouseY() <= 680 && State.getState() == s) {
						State.setState(set);
					}
		// option
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 100 && mouseManager.getMouseY() <= 200 && State.getState() == Option) {
			State.setState(gamestat);
			cricket = 1;
			foot = 0;
			cin = 0;
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 300 && mouseManager.getMouseY() <= 400 && State.getState() == Option) {
			State.setState(gamestat);
			cricket = 0;
			foot = 1;
			cin = 0;
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 500 && mouseManager.getMouseY() <= 600 && State.getState() == Option) {
			State.setState(gamestat);
			cricket = 0;
			foot = 0;
			cin = 1;
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 700 && mouseManager.getMouseY() <= 800 && State.getState() == Option) {
			State.setState(mainmen);
		} else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 100 && mouseManager.getMouseY() <= 200 && State.getState() == set) {
			//label1 = new JLabel("Enter the name of Player 1: ");
	        //label2 = new JLabel("Enter the name of Player 2: ");
	        //textField1 = new JTextField(20);
	        //textField2 =new JTextField(20);
			if(sound) {
			on= new JRadioButton("ON",true);
			off= new JRadioButton("OFF",false);
			}
			else
			{
				on= new JRadioButton("ON",false);
				off= new JRadioButton("OFF",true);
			}
			bg=new ButtonGroup();
			bg.add(on);
			bg.add(off);
			on.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(!sound)
					Music.musi(clap);
					sound =true;
					
				}
			});
			off.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					//sound=false;
					sound=false;
					Music.offmusi(clap);
				}
			});
	        button = new JButton("DONE");
	        panel = new JPanel();
	        panel.add(on);
	        panel.add(off);
	        //panel.add(label2);
	        //panel.add(textField2);
	        panel.add(button);
	       //buttonPressed Pressed = new buttonPressed();
	        
	        button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
			});
	        frame = new JFrame("ENTER PLAYER NAMES!!!!");
	        frame.add(panel);
	        frame.setSize(500, 400);

	        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
		}
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 300 && mouseManager.getMouseY() <= 400 && State.getState() == set) {
			
			s.names();
			s.saves();
			State.setState(s);
			//s.saves();
			//s.names();
		}
		else if (mouseManager.isLeftPressed() && mouseManager.getMouseX() >= 500 && mouseManager.getMouseX() <= 700
				&& mouseManager.getMouseY() >= 500 && mouseManager.getMouseY() <= 600 && State.getState() == set)
			State.setState(mainmen);

		if (mouseManager.isLeftPressed()) {
			mouseManager.setleft();
		}
		if (State.getState() != null) {
			if (State.getState() != gamestat) {
				State.getState().tender(g);
			} else {
				gamestat.tender(g);
				if (runframe) {	
					
					label1 = new JLabel("Enter the name of Player 1: ");
			        label2 = new JLabel("Enter the name of Player 2: ");
			        textField1 = new JTextField(20);
			        textField2 =new JTextField(20);
			        button = new JButton("LET'S PLAY");
			        panel = new JPanel();
			        panel.add(label1);
			        panel.add(textField1);
			        panel.add(label2);
			        panel.add(textField2);
			        panel.add(button);
			        buttonPressed Pressed = new buttonPressed();
			        
			        button.addActionListener(Pressed);
			        frame = new JFrame("ENTER PLAYER NAMES!!!!");
			        frame.add(panel);
			        frame.setSize(500, 400);

			        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			        frame.setLocationRelativeTo(null);
			        frame.setVisible(true);
					runframe = false;
				}
				//hs.setA(player1);
				//hs.setB(player2);
				//tread.wait();
				
			}
		}
		if (State.getState() == gamestat) {
			deck.set(g);
			//g.drawString("" + "asaihd", 500, 75);
			//g.drawString("" +  player2, 500, 750);
			if (cnt == 0) {
				if (cricket == 1 && foot == 0 && cin == 0)
					pl.tender(g, 0, cnt, 0);
				else if (cricket == 0 && foot == 1 && cin == 0)
					football.tender(g, 0, cnt, 0);
				else
					cinema.tender(g, 0, cnt, 0);
				counter = 0;
				thispl = num.getnum();
			} else {
				Number.set(thispl);
				if (cricket == 1 && foot == 0 && cin == 0)
					pl.tender(g, counter, cnt, thispl);
				else if (cricket == 0 && foot == 1 && cin == 0)
					football.tender(g, counter, cnt, thispl);
				else
					cinema.tender(g, counter, cnt, thispl);
			}
			
			if (cricket == 1 && foot == 0 && cin == 0)
				pl.amount(g, amount);
			else if (cricket == 0 && foot == 1 && cin == 0)
				football.amount(g, amount);
			else
				cinema.amount(g, amount);
			po.calculate(g, rem1, point1);
			po.calculate2(g, rem2, point2);
			if (keyManager.right&&stopper==0) {
				cnt++;
				if(counter==0&&sound)
				ms.finale(clap2);
				// amount++;
				keyManager.make();
			}
			if(counter==10&&stopper<0)
			{
				g.drawImage(tx, 470, 410, null);
				if (cricket == 1 && foot == 0 && cin == 0)
					f = pl.getPoint();
				else if (cricket == 0 && foot == 1 && cin == 0)
					f = football.getPoint();
				else
					f = cinema.getPoint();
				g.drawString(""+f, 475, 445);
				Music.hell(clap3);
			}
			if(counter==10&&stopper==0&&bool)
			{
				bool =false;
				stopper=-3;
			}
			System.out.println(""+stopper+""+counter);
			if (counter>= 10&&stopper==0) {
				//counter=;
				//State.setState(result);
				bool=true;
				//g.drawImage(tx,500,500,null);
				
				//Thread.sleep(2000);
				nothing1 = 0;
				nothing2 = 0;
				if (b == 1) {
					rem1 -= amount;
					if (cricket == 1 && foot == 0 && cin == 0)
						f = pl.getPoint();
					else if (cricket == 0 && foot == 1 && cin == 0)
						f = football.getPoint();
					else
						f = cinema.getPoint();
					// System.out.println(f);
					point1 += f;
					point1 = (float) (Math.round(point1 * 100) / 100.0);
				}
				if (b == 2) {
					rem2 -= amount;
					if (cricket == 1 && foot == 0 && cin == 0)
						f = pl.getPoint();
					else if (cricket == 0 && foot == 1 && cin == 0)
						f = football.getPoint();
					else
						f = cinema.getPoint();
					point2 += f;
					point2 = (float) (Math.round(point2 * 100) / 100.0);
				}
				b = 0;
				cnt = 0;
				amount = 100000;
				counter = 0;
				deck.setnumber();
				gone++;
				//Thread.sleep(2000);
				if (gone == 20) {
					State.setState(result);
					if(sound)
					ms.finale(clap3);
					//System.out.println("efhgurgu");

				}
				
				
				// g.drawString("PRESS D", 430, 510);
			}
			if (keyManager.uparrow && b != 1 && cnt != 0 && rem1 > amount&&stopper==0) {
				b = 1;
				amount += 100000;
				keyManager.make();
				counter = 0;
			}
			if (keyManager.up && b != 2 && cnt != 0 && rem2 > amount&&stopper==0) {
				b = 2;
				amount += 100000;
				keyManager.make();
				counter = 0;
			}
			if (b == 1) {
				if (amount > rem1) {
					nothing1 = 1;
					b = 2;
					g.drawImage(t4, 1100, 30, null);
				}

				// bid.first(g);
				// else
				// g.drawImage(t, 1100, 30, null);
			} else if (b == 2) {
				if (amount > rem2) {
					nothing2 = 1;
					b = 1;
					g.drawImage(t4, 1100, 30, null);
				}
				// bid.second(g);
				// else
				// g.drawImage(t, 1100, 700, null);
			}
			if (b == 1)
				g.drawImage(t, 1100, 30, null);
			if (b == 2)
				g.drawImage(t, 1100, 700, null);
			Font f = new Font("arial", Font.BOLD, 20);
			g.setFont(f);
			g.setColor(Color.WHITE);
			g.drawString("POWER", 1150, 80);
			g.drawString("POWER", 1150, 760);
			if (rem1 < amount || (b == 2 && amount == rem1)) {
				g.drawImage(t4, 1100, 30, null);
			}
			if (rem2 < amount || (b == 1 && amount == rem2)) {
				g.drawImage(t4, 1100, 700, null);
			}
		} else
			counter = 0;
		bs.show();
		g.dispose();
	}
	public class buttonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            player1 = textField1.getText().toString();
            player2 = textField2.getText().toString();
            if(player1.length()==0)
            	player1="PLAYER_1";
            if(player2.length()==0)
            	player2="PLAYER_2";
            System.out.println(""+player1);
            System.out.println(""+player2);
            frame.dispose();
            //tread.notifyAll();
        }
        
    }
	public Display getDis() {
		return dis;
	}

	public void setDis(Display dis) {
		this.dis = dis;
	}

	public void run() {
		int fps = 60;
		double timePerTick = 100000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		init();
		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				try {
					tick();
					tender();
					ticks++;
					delta--;
				} catch (Exception e) {

				}
			}

			if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
				if(stopper==0)
				counter++;
				if(stopper<0)
				stopper++;
				//cnt++;
				System.out.println(counter);
			}
		}
	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		tread = new Thread(this);
		tread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			tread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
