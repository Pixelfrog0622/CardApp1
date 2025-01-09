package CardApp1;

public class cardsset {

  private String suit;
  private int num;
  public cardsset(String suit, int num){
      this.suit = suit;
      this.num = num;
  }
  public String getSuit() {
      return suit;
  }
  public void setSuit(String suit) {
      this.suit = suit;
  }
  public int getNum() {
      return num;
  }
  public void setNum(int num) {
      this.num = num;
  }

}