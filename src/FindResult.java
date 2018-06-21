


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindResult")
public class FindResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] keywords = request.getParameter("keywords").split(",");
		PrintWriter out = response.getWriter();
		String respath = "E:/cvscan-master/cvscan/Resumes/";
		
		//Get the list of user files
		Set<String> userlist = new HashSet<>();
        File folder = new File(respath);
        File[] listoffiles = folder.listFiles();
        String user;
        for(int i = 0; i < listoffiles.length; i++){
            user = listoffiles[i].getName();
            if(listoffiles[i].isFile() && user.substring(user.length() - 3, user.length()).equals("txt"))
                userlist.add(user);
            System.out.println(listoffiles[i].getName());
        }
        
        //Search through all json files
        for(String cuser: userlist) {
        	ArrayList<String> al = new ArrayList<String>();
        	
        	File file =
        		      new File(respath + cuser);
        		    Scanner sc = new Scanner(file);
        		    String temp = "";
        		 
        		    List<String> lines = Collections.emptyList();
        		    try
        		    {
        		      lines =
        		       Files.readAllLines(Paths.get(respath+cuser), StandardCharsets.UTF_8);
        		    }
        		 
        		    catch (IOException e)
        		    {
        		 
        		      // do something
        		      e.printStackTrace();
        		    }
        		    
        		    for(String s: keywords) {
        		    	for(String el: lines) {
        		    		if(el.equals(s)) {
        		    			al.add(el);
        		    			break;
        		    		}
        		    	}
        		    }
        		    if (al.size() > 0){ 
        		    	out.print("<br>");
        	        	out.print("<a href='" + respath + cuser.substring(0, cuser.length()-3) + "pdf" + "'><h3>"+cuser.substring(0, cuser.length()-4)+"</h3></a>");
        	        	out.print("<ul>");
        	        	for(String el: al){
        	        		out.print("<li>"+ el +"</li>");
        	        	}
        	        	out.print("</ul><br>");
        		    }
        		    sc.close();
        }
	}

}
