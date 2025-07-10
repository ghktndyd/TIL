package javaexam;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.pick();
        System.out.println(card);

        deck.shuffle();
        card = deck.pick(0);
        System.out.println(card);
    }
}

class Deck {
    final int CARD_NUM = 52; // 카드 개수
    Card[] cardArr = new Card[CARD_NUM];

    Deck() { // Deck이 new 키워드에 의해서 생성될 때 동작하는 코드
        int i = 0;

        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4; // 카드의 무늬 수 (스페이드, 다이아, 클로버, 하트)
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEARD = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
