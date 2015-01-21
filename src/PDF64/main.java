package PDF64;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 

 public class main {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\asanmartinpc\\Documents\\textobase64.txt");
        File file = new File(args[0]);

 byte[] Base;
        FileInputStream fis = new FileInputStream(file);
        //System.out.println(file.exists() + "!!");
        //InputStream in = resource.openStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //no doubt here is 0
                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            //Logger.getLogger(genJpeg.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes = bos.toByteArray();
        
        Base = Base64.decode(bytes);
 
        //below is the different part
//        File someFile = new File("C:\\Users\\asanmartinpc\\Documents\\CAXOJP.pdf");
        File someFile = new File(args[1]);
        FileOutputStream fos = new FileOutputStream(someFile);
        fos.write(Base);
        fos.flush();
        fos.close();
    }
}