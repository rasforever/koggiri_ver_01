package koggiri.approval.model;

import java.io.Serializable;

public class CardType implements Serializable {
	private String card_t_cd;
	private String card_t_nm;
	
	public CardType() {}

	public CardType(String card_t_cd, String card_t_nm) {
		super();
		this.card_t_cd = card_t_cd;
		this.card_t_nm = card_t_nm;
	}

	public String getCard_t_cd() {
		return card_t_cd;
	}

	public void setCard_t_cd(String card_t_cd) {
		this.card_t_cd = card_t_cd;
	}

	public String getCard_t_nm() {
		return card_t_nm;
	}

	public void setCard_t_nm(String card_t_nm) {
		this.card_t_nm = card_t_nm;
	}
	
	
	

}
