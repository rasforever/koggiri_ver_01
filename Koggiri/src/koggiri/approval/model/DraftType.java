package koggiri.approval.model;

import java.io.Serializable;

public class DraftType implements Serializable {
	private int draft_t_cd;
	private String draft_t_nm;
	
	public DraftType() {}
	
	public DraftType(int draft_t_cd, String draft_t_nm) {
		super();
		this.draft_t_cd = draft_t_cd;
		this.draft_t_nm = draft_t_nm;
	}
	public int getDraft_t_cd() {
		return draft_t_cd;
	}
	public void setDraft_t_cd(int draft_t_cd) {
		this.draft_t_cd = draft_t_cd;
	}
	public String getDraft_t_nm() {
		return draft_t_nm;
	}
	public void setDraft_t_nm(String draft_t_nm) {
		this.draft_t_nm = draft_t_nm;
	}
	
	
}
