package TireEx;

public class HankookTire implements Tire {
    @Override
    public void roll() { // Tire 인터페이스 구현
        System.out.println("한국 타이어가 장착되어있음. ");
    }
}
