package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];    // 10개만 넣게할 것
    private int itemCount;

    // 장바구니에 물품 추가
    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다");
        }
        items[itemCount] = item;
        itemCount++;
    }

    // 아이템 별 가격
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){    // length는 10개 이하일 때 X
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("총 가격: " + calculateTotalPrice());
    }

    // 전체 가격 합
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}