import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class SpellCard extends Card {
	private String effect;
	private String type;
	private static SpellCard[] arrayOfSpellCard = new SpellCard[4];
	
	public SpellCard(String name, String desc, double probability, String type, String effect, int idKartu){
		super(name, desc, probability, idKartu);
		this.effect = effect;
		this.type = type;
		
	}
	
	public SpellCard(){
		super();
		this.effect = "";
		this.type = "";
	}
	
	public void setEffect(String effect){
		this.effect = effect;
	}
	
	public String getEffect(){
		return this.effect;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void printCard(){
		System.out.print("Nama : ");
		System.out.println(getName());
		System.out.print("Desc : ");
		System.out.println(getDesc());
		System.out.print("Probability to get this card : ");
		System.out.println(getProbability());
		System.out.print("Type : ");
		System.out.println(getType());
		System.out.print("Effect : ");
		System.out.println(getEffect());
	}
	
	public boolean isUp() {
		return super.getPos()==1;
	}
	
	public boolean isDown() {
		return super.getPos() ==0;
	}
	
	public void setUp() {
		super.setUp();
	}
	
	public void setDown() {
		super.setDown();
	}
	
	public int getID() {
		return super.getID();
	}
	
	public static SpellCard[] getArrayOfSpellCard(){
		return SpellCard.arrayOfSpellCard;
	}
	
	public static SpellCard getArrayOfSpellCard(int idx){
		return SpellCard.arrayOfSpellCard[idx];
	}
	
public static SpellCard[] bacaSpellCard()throws IOException{
	    BufferedReader br = new BufferedReader(new FileReader("SpellCard.txt"));
	    try {
	        while (br.readLine() != null) {
	        for (int i = 0;i < 4; i++) {
	        	String name = br.readLine();
	            String desc = br.readLine();
	            double probability = Double.parseDouble(br.readLine());
	            String type = br.readLine();
	            String effect = br.readLine();
	            int id = Integer.parseInt(br.readLine());
	            SpellCard spellCard = new SpellCard(name,desc,probability,type,effect,id);
	            SpellCard.arrayOfSpellCard[i] = spellCard;
	          
	        }     
	        
	    }
	       
	    } finally {
	        br.close();
	      }
	    return SpellCard.arrayOfSpellCard;    
	}
}

