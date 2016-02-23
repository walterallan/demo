package demo.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value="myBean")
@Component
public class MyBean {

	private String username;

	private String password;

	private Card card;
	
//	@Autowired
//	public MyBean(@Value("${app.username}")String username){
//		this.username = username;
//	}

	@Autowired
	public MyBean(Card card) {
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
