public class Main{
	public static void main(String[] args){
		Frame g = new Frame();
		final Frame f = g;
		Thread t = new Thread(){
			@Override
			public void run(){
				f.checkHorizontal();
			}
		};
		Thread s = new Thread(){
			@Override
			public void run(){		
				f.checkVertical();
			}			
		};
		Thread r = new Thread(){
			@Override			
			public void run(){
				f.checkDiagonal();
			}
		};
		
		t.start();
		s.start();
		r.start();
		
	}
}

