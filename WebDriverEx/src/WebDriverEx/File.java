package WebDriverEx;
import java.io.IOException;
public class File {
	public static void main(String[] args)throws IOException
	{
		java.io.File x=new java.io.File("d:\\12.xls");
	
		if(!(x.exists()))
		{
			x.createNewFile();
			}
		if(x.exists())
		{
			System.out.println("File Exists");
		}
		//TO print absolut Path
		System.out.println(x.getAbsolutePath());
		//To Dele
		
		
}

}
