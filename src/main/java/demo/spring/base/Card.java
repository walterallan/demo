package demo.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Card {

	private String cardNO = "001";
	
	@Autowired
	public Card(@Value("${app.card:wto}")String name){
		this.cardNO = name;
	}
	
	

	public String getCardNO() {
		return cardNO;
	}

	public void setCardNO(String cardNO) {
		this.cardNO = cardNO;
	}
	
	
}
