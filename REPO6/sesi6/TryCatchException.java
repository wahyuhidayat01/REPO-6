import java.io.*;

public class TryCatchException {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		try {
			System.out.println("choode one of the options,(1-3) "+"\n\t1.) Steak " + "\n\t2.) Loobster" + "\n\t3.) Cheeseburger");
			System.out.println("Masukkan Pilihan Anda : ");
			String choose = input.readLine();
			if(choose.equals("1")){
				System.out.println("Anda Memilih Steak :-)");
			} else if(choose.equals("2")){
				System.out.println("Anda Memilih Loobster :-)");
			} else if(choose.equals("3")){
				System.out.println("Anda Memilih cheeseburger :-)");
			} else {
				throw new Exception("Pilihan anda tidak ada !");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}