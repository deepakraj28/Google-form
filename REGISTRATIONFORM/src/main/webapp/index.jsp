<%@page import= "java.util.*" %>
<%@page import= "java.lang.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GOOGLE FORM</title>
<style>
 #id
 {
   width:700px;
   height:750px;
   color:black;
   background-color:grey;
   display:flex;
   flex-direction:column;
   border:2px solid;
   border-radius:8px;
   align-items:center;
 }   

 .c
 {
    width:250px;
    heigth:10px;
    padding:3px;
 }
 .d
 {
    width:250px;
    heigth:10px;
    padding:3px; 
    display:flex;
   flex-direction:column;
   align-items:center;
 }
 
</style>
</head>
<body>
<%List<String>li=(ArrayList<String>)request.getAttribute("error");
if(li!=null){ 
	Iterator<String>itr=li.iterator();
%>
	<ul>
	<% while(itr.hasNext()){%>
		<li><%=itr.next()%></li>
	<% }%>
	</ul>
<% }%>

<div id="id">
 <h1>FILL THE DETAILS</h1>
    <form action="FormCont " method="post">
    <div class="c">
         regno<input type="text" name="regno"><br><br>
    </div>
    <div class="c">
         name<input type="text" name="name"><br><br>
    </div>
   
    <div class="c">   
         gender<input type="text" name="gender"><br><br>
    </div>
    <div class="c">   
         dept
         <select name="dept"><option value="CSE">CSE</option>
         <option value="ECE">ECE</option>
         <option value="IT">IT</option>
         <option value="AIDS">AIDS</option>
         <option value="MECH">MECH</option>
         <option value="CIVIL">CIVIL</option>
         </select>
        <br><br>
    </div>
    <div class="c">    
         address<input type="text" name="addr"><br><br>
    </div>
     <div class="c">
         age<input type="text" name="age" ><br><br>
    </div>  
    <div class="d">     
         <input type="Submit" value="Submit">
    </div>     
    </form>
</div>
   
</body>
</html>