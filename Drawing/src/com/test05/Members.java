package com.test05;

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
	public Hero(int x, int y) {
		super(x, y);
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
