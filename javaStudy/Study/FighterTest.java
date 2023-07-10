abstract class Unit2{
    int x, y;
    abstract void move(int x, int y);
    void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {
    void move(int x, int y); // public abstract 생략됨
    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable{
    // 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
    public void move(int x, int y){
        System.out.println("["+x+","+y+"]로 이동");
    }
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    Fightable getFightable(){
        Fightable f = new Fighter();
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args){
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();
        f.attack(f);
        f2.attack(f2);
    }
}
