
public class Main {
    public static void main(String[] args) {
        int status = 5;
        for(int i = 1; i < 11; i++){
            if(status > 0) {
                --status;
                System.out.println(i + "번 주문 성공, 남은 재고: "+ status);
            }else{
                System.out.println(i + "번 주문 실패, 재고 없음");
            }
        }
    }
}
