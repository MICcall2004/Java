package TireEx;

public class Car { // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void run() {
        for (Tire tire : tires) {
            tire.roll();
        }
    }
}
