package com.test03;

//子弹类
class Shot implements Runnable{
	int x;
	int y;
	int direct;
	int speed = 5;
	//子弹的生命（是否还或者）
	boolean isLive = true;
	
	public Shot(int x,int y,int direct) {
		this.x = x;
		this.y = y;
		this.direct = direct;
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			switch (direct) {
			case 0://上
				y -= speed;
				break;
			case 1://右
				x += speed;
				break;
			case 2://下
				y += speed;
				break;
			case 3://左
				x -= speed;
				break;
			default:
				break;
			}
			System.out.println("子弹坐标 x= " + x + "y = " + y);
			//子弹何时死亡
			//TODO
			//判断该子弹是否碰到边缘
			if (x < 0 || x > 400 || y < 0 || y > 300) {
				this.isLive = false;
				break;
			}
		}

	}
	
}


//定义一个坦克类
class Tank {
	int x = 0;// 横坐标
	int y = 0;// 纵坐标
	
	//坦克方向
	//0表示上 1表示右 2表示下 3表示左
	int direct = 0;
	
	//设置坦克的速度
	int speed = 2;
	
	//定义坦克的颜色
	int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//敌人的坦克
class EnemyTank extends Tank{

	public EnemyTank(int x, int y) {
		super(x, y);
	}
	
}


//自己的坦克
class Hero extends Tank {
	
	//子弹
	Shot shot = null;
	
	public Hero(int x, int y) {
		super(x, y);
	}
	
	// 开火
	public void shotEnemy() {
		
		switch (this.direct) {
		case 0:
			shot = new Shot(x + 10, y, 0);
			break;
		case 1:
			shot = new Shot(x + 30, y + 10, 1);
			break;
		case 2:
			shot = new Shot(x + 10, y + 30, 2);
			break;
		case 3:
			shot = new Shot(x, y + 10, 3);
			break;
		default:
			break;
		}
		//启动子弹线程
		Thread thread = new Thread(shot);
		thread.start();
	}
	
	//坦克向上移动
	public void moveUp() {
		y -= speed;
	}
	
	//像右移动
	public void moveRight() {
		x += speed;
	}
	
	//像下移动
	public void moveDown() {
		y += speed;
	}
	
	// 像左移动
	public void moveLeft() {
		x -= speed;
	}
}
