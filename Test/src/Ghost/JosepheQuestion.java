/*
 * *约瑟夫问题
 */
package Ghost;

public class JosepheQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycLink cycLink = new CycLink();
		cycLink.setLen(5);
		cycLink.createLink();
		cycLink.setK(2);
		cycLink.setM(2);
		cycLink.show();
		
		cycLink.play();
	}

}

class Man{
	int no;//编号
	Man nextMan = null;
	
	public Man(int no) {
		//给出一个编号
		this.no = no;
	}
}
//环形链表
class CycLink{
	//定义一个指向链表第一个Man的引用
	Man firstMan = null;//指向第一个Man的引用不能用
	Man temp = null;
	int len = 0;//表示共有几个人
	int k = 0;
	int m = 0;
	
	//设置环形链表的大小
	public void setLen(int len) {
		this.len = len;
	}
	//设置从第几个人开始数数
	public void setK(int k) {
		this.k = k;
	}
	
	public void setM(int m) {
		this.m = m;
	}
	
	//开始play
	public void play() {
		Man temp = this.firstMan;
		//1.先找到开始数数的人
		for (int i = 1; i < k; i++) {
			temp = temp.nextMan;
		}
		while (this.len != 1) {
			//2.数m项
			for (int i = 1; i < m; i++) {
				temp = temp.nextMan;
			}
			//找到要出圈前的一个Man
			Man temp2 = temp;
			while (temp2.nextMan != temp) {
				temp2 = temp2.nextMan;
			}
			//3.将数到m和Man，删除该人
			temp2.nextMan = temp.nextMan;
			temp = temp.nextMan;//让temp指向下一个数数的Man
//			this.show();
			this.len --;
		}
		//最后一个Man
		System.out.println("最后出圈：" + temp.no);
	}
	
	//初始化环形链表
	public void createLink() {
		for (int i = 1; i <= len; i++) {
			if (i == 1) {
				//创建第一个Man
				Man man = new Man(i);
				this.firstMan = man;
				this.temp = man;
			}else {
				if (i == len) {//创建最后一个Man
					//继续创建Man
					Man man = new Man(i);
					temp.nextMan = man;
					temp = man;
					temp.nextMan = this.firstMan;
				}else {
					//继续创建Man
					Man man = new Man(i);
					temp.nextMan = man;
					temp = man;
				}
			}
		}
	}
	
	public void show() {
		//定义一个跑龙套的
		Man temp = this.firstMan;
		do {
			System.out.print(temp.no + " ");
			temp = temp.nextMan;	
		} while (temp != this.firstMan);
	}
}

