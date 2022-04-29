package oops;
public class Box {
	public double l;
	public double w;
	public double h;
	
	public Box(){
		l=1;
		w=1;
		h=1;
	}
	public Box(double len, double wid, double hei){
		l=len;
		w=wid;
		h=hei;
	}
	public Box(double len, double wid){
		l=len;
		w=wid;
		h=25.00;
	}
	public double volume(){
		
		return l*w*h; 
	}

}
