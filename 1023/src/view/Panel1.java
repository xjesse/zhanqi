package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Panel1 extends JPanel{

	public static ArrayList<cell> celllist;
	public  static ArrayList<JLabel> jlabellist;
	public Panel1(ArrayList<cell> cl1){
		this.celllist=cl1;
		setLayout(null);
		setPreferredSize(new Dimension(850, 50));//主界面的宽度；
//		setBackground(new Color(54 ,54, 54));

		
		 JPanel  GImage = new JPanel() {  
	  	  
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {  
	            ImageIcon icon = new ImageIcon("C:/Users/Administrator/Desktop/图片素材库/timg.jpg");  
	            Image img = icon.getImage();  
	            g.drawImage(img, 0, 0, icon.getIconWidth(),  
	                    icon.getIconHeight(), icon.getImageObserver());    
	        }  
	    };  
		
	    GImage.setBounds(0,0,900,700);
		

	    
//	    for (cell ce1 : celllist){
//
//	    }
	    
	    jlabellist =new ArrayList<JLabel>();
	    for (int i=0;i<25;i++){
	    	cell cel=celllist.get(i);	
	    	JLabel j1=new JLabel(cel.getnum()+"");
	    	j1.setBounds(cel.getpositioni()*100, cel.getpositionj()*100, 80, 80);

	    	
	    	if (i==12){
	    		cel.setstate(2);
	    		cel.setnum(100);
	    	}
	    	jlabellist.add(j1);

//	    	add(j1);
//	    	remove(j1);
	    	
	    }
	    this.re();



	      
		add(GImage);

    
	}

	public  void re(){
		
//		System.out.println(jlabellist.size()+"hsxfkljhjsdkjlfh");
		for(int i=0 ;i<25;i++){
		cell cel=celllist.get(i);
		
//	    System.out.println(i+"jjjjj");
		JLabel j1=jlabellist.get(i);
    	Color  BackgroundClor=getBC(cel);
    	j1.setBackground(BackgroundClor);
    	j1.setText(cel.getnum()+"");
    	j1.setOpaque(true);
    	this.add(j1);
			
		}	
	}
	
	private static Color getBC(cell c1) {
		if(c1.getstate()==1){
			return new Color(130,120,180);	
		}
		else if(c1.getstate()==2){
			return new Color(200,70,30);	
		}
		else 
			return new Color(200,200,50);	
	}
	

	
}
