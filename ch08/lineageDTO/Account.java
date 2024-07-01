package ch08.lineageDTO;

public class Account {

	//field
	private String id;
	private String pw;
	private String nickname;
	//private ElfDTO elfDTO; //요정 객체
	//private KnightDTO knightDTO; //기사 객체
	private HumanDTO humanDTO;
	
	//생성자
	
	
	//method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/*
	 * public ElfDTO getElfDTO() { return elfDTO; } public void setElfDTO(ElfDTO
	 * elfDTO) { this.elfDTO = elfDTO; } public KnightDTO getKnightDTO() { return
	 * knightDTO; } public void setKnightDTO(KnightDTO knightDTO) { this.knightDTO =
	 * knightDTO; }
	 */
	public HumanDTO getHumanDTO() {
		return humanDTO;
	}
	public void setHumanDTO(HumanDTO humanDTO) {
		this.humanDTO = humanDTO;
	}
}
