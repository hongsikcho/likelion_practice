
class Main {
    public static void main(String[] args) {
        자동차 c1 = new 자동차();
        자동차 c2 = new 자동차();

        자동차.width = 100;

        System.out.println
        );
        c1.setMax(230);
        c2.setMax(210);

        c1.run();
        c2.run();
        // 구현시작

        // 구현끝

    }
}

class 자동차 {
    static int width ;
    private int max = 10;

    public void setMax(int max) {
        this.max = max;
    }

    public void run(){
        System.out.println("자동차가 최고속력"+this.max+"km로 달립니다.");
    }
}