package view;


public class  cell {
	private int num;
private int state;//敌方阵营 ：0  我方普通单位 ：1我方英雄单位：2
private int position;//位置
	public cell(int i,int j){
		num=1;
		position=i*5+j;
		state=0;				
	}
	
public  void setstate(int state){
	 this.state=state;
}	
	
public  int getstate(){
	return state;
}
	
public  int getpositioni(){
	return position/5;
}
	
public  int getpositionj(){
	return position%5;
}

public  int getposition(){
	return position;
}

public void setnum(int num){
 this.num=num;
}

public int getnum(){
	return num;
}

}
