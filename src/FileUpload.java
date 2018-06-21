

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Here");
		String filename = request.getParameter("file");
		//filename.replaceAll("\\", "\\\\");
		//String[] dirs = filename.split("\\\\");
		//System.out.println(dirs[dirs.length-1]);
		System.out.println(filename);
		
		try {
            ProcessBuilder pb = new ProcessBuilder("python", "E:/cvscan-master/cvscan/__init__.py", filename);
            final Process p = pb.start();
            
            while(p.isAlive()) continue;
            System.out.println(p.exitValue());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
	}

}
