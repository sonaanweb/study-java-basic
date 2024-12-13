package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max){ // 다른 패키지에서도 사용할 수 있어야한다는 조건
        this.max = max;
    }
    
    public void increment(){
        if(count >= max){   // 검증 로직
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
        // 실행 로직 = > if / else 분리
        count++;
    }

    public int getCount(){
        return count;
    }
}
