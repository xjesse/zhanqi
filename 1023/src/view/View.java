package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


public class View extends JFrame{
   static  ArrayList<cell> celllist = new ArrayList<cell>();
   public static Panel1 j1;
   public static int ji1=0;
	public View(ArrayList<cell> cl1) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮后，程序结束
		setBounds(300,30,490,510);//设置大小
		setResizable(false);//不可缩放
	    j1=new Panel1(cl1);
		add(j1);
		setTitle("主窗口");//窗口的名字

		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyChar()){
				
				case 'w':{
					

					 ji1=0;
			    	  for (int i=0;i<25;i++){
			    		
			    		 
			    		  cell cel=j1.celllist.get(i);
			    		  if(cel.getstate()!=0){
			    			  ji1++;
			    		  }
					    	if(cel.getstate()!=0){//我方单位向上移动
					    		if(cel.getpositionj()!=0){
					    			
							    	cell cel2=j1.celllist.get(i-1);//后来的		
							    	int b1=cel.getnum()/2;
						    	cel.setnum(cel.getnum()-b1);
					                if(cel2.getstate()!=0){
//					                	System.out.println(cel2.getnum()+b1+"asdhaskjdhasjkhfdllllllllllll");
							    	cel2.setnum(cel2.getnum()+b1);
//							    	cel2.setnum(1000);
							    	}else{
							    		System.out.println("132131231f"+(cel2.getnum()-b1));
							    	cel2.setnum(cel2.getnum()-b1);
							    	
							    	if(cel2.getnum()<0){
							    	cel2.setstate(1);
							    	cel2.setnum(cel2.getnum()*-1);
							    	}	
							    	}
									}

					    	}
			    	  }
			    	
			    	
					
				    for (int i=0;i<25;i++){
				    	
				    	cell cel=j1.celllist.get(i);
				    	if(cel.getstate()==0){
				    	cel.setnum(cel.getnum()+5);
				    	}
				    	cel.setnum(cel.getnum()+1);
				    	
				    int r1=(int) (Math.random()*4)+1;
				    run1(r1,j1.celllist,cel,i);
				    	if(cel.getstate()==2){ 
				    		cel.setnum(cel.getnum()+2*ji1);
				    	}

				     	j1.re(); 	
				     	
				    }
				 
//				    System.out.println("wwwwwwwwwww");
				    }
				break; 
				case 'a':{ 
					ji1=0;
			    	  for (int i=0;i<25;i++){
			    		  cell cel=j1.celllist.get(i);
			    		  if(cel.getstate()!=0){
			    			  ji1++;
			    		  }
					    	if(cel.getstate()!=0){//我方单位向上移动
					    		if(cel.getposition()>4){
					    			
							    	cell cel2=j1.celllist.get(i-5);//后来的		
							    	int b1=cel.getnum()/2;
						    	cel.setnum(cel.getnum()-b1);
					                if(cel2.getstate()!=0){
//					                	System.out.println(cel2.getnum()+b1+"asdhaskjdhasjkhfdllllllllllll");
							    	cel2.setnum(cel2.getnum()+b1);
//							    	cel2.setnum(1000);
							    	}else{
							    		System.out.println("132131231f"+(cel2.getnum()-b1));
							    	cel2.setnum(cel2.getnum()-b1);
							    	
							    	if(cel2.getnum()<0){
							    	cel2.setstate(1);
							    	cel2.setnum(cel2.getnum()*-1);
							    	}	
							    	}
									}

					    	}
			    	  }
					
					
				    for (int i=0;i<25;i++){
				    	cell cel=j1.celllist.get(i);
				     	if(cel.getstate()==0){
					    	cel.setnum(cel.getnum()+3);
					    	}
				    	
				    	cel.setnum(cel.getnum()+1);
				    int r1=(int) (Math.random()*4)+1;
				    run1(r1,j1.celllist,cel,i);
				    	j1.re(); 	
				    	if(cel.getstate()==2){
				    		cel.setnum(cel.getnum()+2*ji1);
				    	}
				    
				    }}
				break; 
				case 's':{ 
					ji1=0;
			    	  for (int i=0;i<25;i++){
			    		  cell cel=j1.celllist.get(i);
			    		  if(cel.getstate()!=0){
			    			  ji1++;
			    		  }
			    		 	if(cel.getstate()==0){
						    	cel.setnum(cel.getnum()+2);
						    	}
			    		  
					    	if(cel.getstate()!=0){//我方单位向下移动
					    		if(cel.getpositionj()!=4){
					    			
							    	cell cel2=j1.celllist.get(i+1);//后来的		
							    	int b1=cel.getnum()/2;
						    	cel.setnum(cel.getnum()-b1);
					                if(cel2.getstate()!=0){
//					                	System.out.println(cel2.getnum()+b1+"asdhaskjdhasjkhfdllllllllllll");
							    	cel2.setnum(cel2.getnum()+b1);
//							    	cel2.setnum(1000);
							    	}else{
							    		System.out.println("132131231f"+(cel2.getnum()-b1));
							    	cel2.setnum(cel2.getnum()-b1);
							    	
							    	if(cel2.getnum()<0){
							    	cel2.setstate(1);
							    	cel2.setnum(cel2.getnum()*-1);
							    	}	
							    	}
									}

					    	}
			    	  }
					
					
					
				    for (int i=0;i<25;i++){
				    	cell cel=j1.celllist.get(i);
				    	
				     	if(cel.getstate()==0){
					    	cel.setnum(cel.getnum()+1);
					    	}
				    	
				    	cel.setnum(cel.getnum()+1);
				    int r1=(int) (Math.random()*4)+1;
				    run1(r1,j1.celllist,cel,i);
				    	j1.re(); 	
				    	if(cel.getstate()==2){
				    		cel.setnum(cel.getnum()+10*ji1);
				    	}
				    
				    }}
				break; 
				case 'd':{ 
					
					ji1=0;
			    	  for (int i=0;i<25;i++){
			    		  cell cel=j1.celllist.get(i);
			    		  if(cel.getstate()!=0){
			    			  ji1++;
			    		  }
					    	if(cel.getstate()!=0){//我方单位向下移动
					    		if(cel.getposition()<20){
					    			
							    	cell cel2=j1.celllist.get(i+5);//后来的		
							    	int b1=cel.getnum()/2;
						    	cel.setnum(cel.getnum()-b1);
					                if(cel2.getstate()!=0){
//					                	System.out.println(cel2.getnum()+b1+"asdhaskjdhasjkhfdllllllllllll");
							    	cel2.setnum(cel2.getnum()+b1);
//							    	cel2.setnum(1000);
							    	}else{
							    		System.out.println("132131231f"+(cel2.getnum()-b1));
							    	cel2.setnum(cel2.getnum()-b1);
							    	
							    	if(cel2.getnum()<0){
							    	cel2.setstate(1);
							    	cel2.setnum(cel2.getnum()*-1);
							    	}	
							    	}
									}

					    	}
			    	  }
					
					
				    for (int i=0;i<25;i++){
				    	cell cel=j1.celllist.get(i);
				    	
				     	if(cel.getstate()==1){
					    	cel.setnum(cel.getnum()+1);
					    	}
				    	cel.setnum(cel.getnum()+1);
				    int r1=(int) (Math.random()*4)+1;
				    run1(r1,j1.celllist,cel,i);
				    	j1.re(); 	
				    	if(cel.getstate()==2){
				    		cel.setnum(cel.getnum()+ji1);
				    	}
				    }
				}
				
				}
				
			}

			private void run1(int r1, ArrayList<cell> celllist, cell cel, int i) {
				if(r1==1&&cel.getpositionj()!=0&&cel.getstate()==0){
		    	cell cel2=j1.celllist.get(i-1);//后来的		
		    	int b1=cel.getnum()/2;
		    	cel.setnum(cel.getnum()-b1);
                if(cel2.getstate()==0){
		    	cel2.setnum(cel2.getnum()+b1);
		    	}else{
		    	cel2.setnum(cel2.getnum()-b1);
		    	if(cel2.getnum()<0){
		    	cel2.setstate(0);
		    	cel2.setnum(cel2.getnum()*-1);
		    	}
		    		
		    	}
                
				}
//		    	System.out.println(cel.getpositioni()+"dd"+cel.getpositionj()+"d"+
//		    	cel2.getpositioni()+"sd"+cel2.getpositionj());
		    	
		    	
			    
		    	if(r1==2&&cel.getposition()<20&&cel.getstate()==0){
		    		cell cel2=j1.celllist.get(i+5);
		    	int b1=cel.getnum()/2;
		    	cel.setnum(cel.getnum()-b1);

                if(cel2.getstate()==0){
		    	cel2.setnum(cel2.getnum()+b1);
		    	}else{
		    	cel2.setnum(cel2.getnum()-b1);
		    	if(cel2.getnum()<0){
		    	cel2.setstate(0);
		    	cel2.setnum(cel2.getnum()*-1);
		    	}
		    	}
		    	}
		    	
			    	if(r1==3&&cel.getpositionj()!=4&&cel.getstate()==0){
			    		cell cel2=j1.celllist.get(i+1);
			    	int b1=cel.getnum()/2;
			    	cel.setnum(cel.getnum()-b1);
	                if(cel2.getstate()==0){
	    		    	cel2.setnum(cel2.getnum()+b1);
	    		    	}else{
	    		    	cel2.setnum(cel2.getnum()-b1);
	    		    	if(cel2.getnum()<0){
	    		    	cel2.setstate(0);
	    		    	cel2.setnum(cel2.getnum()*-1);
	    		    	}
			    	}
			    	}
			    	
		    	if(r1==4&&cel.getposition()>4&&cel.getstate()==0){
		    		cell cel2=j1.celllist.get(i-5);
		    	int b1=cel.getnum()/2;
		    	cel.setnum(cel.getnum()-b1);

                if(cel2.getstate()==0){
		    	cel2.setnum(cel2.getnum()+b1);
		    	}else{
		    	cel2.setnum(cel2.getnum()-b1);
		    	if(cel2.getnum()<0){
		    	cel2.setstate(0);
		    	cel2.setnum(cel2.getnum()*-1);
		    	}
		    	}
		    	}

			    
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		setVisible(true);//设置为可见
	}

	public static void initcell(){
	
	    for(int i=0;i<5;i++){
	    	for(int j=0;j<5;j++){
	    
	    	cell c1=new cell(i,j);
  	
	    	celllist.add(c1);
	    	
	    	System.out.println(j);
	    	}	
	    }
	}
	
	public static void main(String[] args){
	initcell();
	View v1=new View(celllist);
	
	}
	
	
	
}
