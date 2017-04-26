package kosta.action;

public class ActionForward {
	private boolean isRedirect; //jsp로 찾아갈때 디스패처로 찾아갈것인지 리다이렉트로 찾아갈것인지 설정
	private String path;
	
	public boolean isRedirect(){
		return isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
}
