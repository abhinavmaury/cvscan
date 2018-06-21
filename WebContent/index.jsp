
<html>

	<head>
		<meta charset="utf-8"/>
		<title>Resume Parser & Classifier</title>

		
		<link href="http://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700" rel='stylesheet' />

		
		<link href="assets/css/style.css" rel="stylesheet" />
	</head>

	<body>

		<form id="upload" method="post" action="FileUpload" enctype="multipart/form-data">
			<div id="drop" method="post">
				Drop Here

				<a>Browse</a>
				<input type="file" name="upl" multiple />
			</div>

			<ul>	
				The file uploads will be shown here
			</ul>

		</form>
		
		<form id="upload" action="FindResult" method="post">
			<input type="text" name="keywords">
			<input type="submit" value="submit">
		</form>

		<footer>
            <h2><a href="http://abhinavmaurya.com"><i>Project:</i> Resume Parser and Classifier</a></h2>
            <div id="tzine-actions">
            	
	            <a id="tzine-download" href="http://abhinavmaurya.com" title="Go to Abhinav's portfolio!">GO!</a>
            </div>
        </footer>
        
		JavaScript Includes
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="assets/js/jquery.knob.js"></script>

		jQuery File Upload Dependencies	
		<script src="assets/js/jquery.ui.widget.js"></script>
		<script src="assets/js/jquery.iframe-transport.js"></script>
		<script src="assets/js/jquery.fileupload.js"></script>
		
		Our main JS file
		<script src="assets/js/script.js"></script>

	</body>
</html>






























<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hey!  Enter your Constraints</title>
</head>
<body>

<form action="FileUpload" method="post" >

Upload Resume:<input type="file" name="file"><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Submit ">
</form>

<form action="FindResult" method="post">
<input type="text" name="keywords">
<input type="submit" value="submit">
</form>
</body>
</html> -->