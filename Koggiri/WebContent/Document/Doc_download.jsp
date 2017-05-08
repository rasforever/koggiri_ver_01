<%@page import="java.net.URLEncoder"%>
<%@page import="koggiri.document.model.FileDownloadHelper"%><%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	request.setCharacterEncoding("utf-8");
	response.reset();
	String fileName = request.getParameter("filename");
	//String fileName = new String(fileName2.getBytes("8859_1"), "UTF-8");
	
	System.out.println(fileName);
	
	fileName = URLEncoder.encode(fileName, "utf-8");
	System.out.println(fileName);
	
	String uploadPath = request.getRealPath("upload");
	String path = uploadPath.trim() + "\\" + fileName.trim();
	
	//파일다운로드 확인창을 보여주는 것
	response.setContentType("application/octet-stream");
	response.setHeader("Content-Disposition",
						"attachment; filename=\""+ fileName + "\"");
	response.setHeader("Content-Transfer-Encoding", "binary");
	response.setHeader("Pragma", "no-cache;");
	response.setHeader("Expires", "-1;");
	
	out.clear();
	out=pageContext.pushBody();
	
	try{
		FileDownloadHelper.copy(path, response.getOutputStream()); //path는 파일다운로드하기위한 경로
		response.getOutputStream().close();
	}catch(Exception e){
		System.out.println("ok");
		e.printStackTrace();
	}
%> 