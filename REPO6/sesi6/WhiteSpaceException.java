public class WhiteSpaceException extends Exception {
	public WhiteSpaceException() {
		super ("Terjadi Kesalahan : 'tidak boleh ada spasi / whitespace'");
	}
	
	public WhiteSpaceException(String text){
		super("Terjadi Kesalahan : 'tidak boleh ada spasi / whitespace', text : "+ text);
	}
}