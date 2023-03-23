import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut{
   public static void main(String[] args){
      Path file = Paths.get("Z:\\PP214\\MUANA\\Java Files\\File_IO");
      String s = "Aling";
      
      byte[] data = s.getBytes();
      
      OutputStream output = null;
      try{
      
      output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
      output.write(data);
      output.flush();
      output.close();
      }
      catch(Exception e){
         System.out.print("MEssage: "+ e);
      }
   }
}