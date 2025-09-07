public class Aulaj {
	public int soma(int x,int y){
		
		return x+y;
	}
	
	public int sub(int x, int y){
		
		return x-y;
	}
	
    public static void main(String[] args) {

        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
		
		Aulaj a = new Aulaj();
		
		int ressoma= a.soma(x,y);
		int ressub= a.sub(x,y);
		
		
		System.out.println("soma:"+ressoma);
		System.out.println("sub:" +ressub);

    }
}

