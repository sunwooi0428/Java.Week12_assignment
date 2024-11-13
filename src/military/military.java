package military;
public class military {
    public static void main(String[] args) {
        Tank2 k1 = new Tank2("k1",1,false,8,12);
        Tank2 k2 = new Tank2("k2",2,false,12,20);
        Tank2 k3 = new Tank2("k3",3,true,6,6);

        k1.printTank();
        k1.movement();
        k1.attack();

        System.out.println();
        k2.printTank();
        k2.movement();
        k2.attack();

        System.out.println();
        k3.printTank();
        k3.movement();
        k3.attack();


    }
}

class Tank{
    String name;
    int weapon;
    boolean missile;
    int tire;
    int speed;
    void printTank(){
        System.out.println("탱크의 종류: " + name );
        System.out.println("탱크에 탑재된 무기 번호: "+ weapon+"번 ");
        System.out.print("미사일 발사 유무: ");
        if(missile){
            System.out.println("가능");
        }
        else{
            System.out.println("불가능");
        }
    }

    void attack(){
        System.out.println("\n화기를 사용합니다.\n");
        if(weapon == 1){
            System.out.println(weapon+"번 화기 사용");
            System.out.println("쾅\n");
        }
        if(weapon == 2){
            System.out.println(weapon+"번 화기 사용");
            System.out.println("펑\n");
        }
        if(weapon == 3){
            System.out.println(weapon+"번 화기 사용");
            System.out.println("미사일 발사!!");
            System.out.println("부와아아아아아아악\n");
        }


    }

}

class Tank2 extends Tank{
    Tank2(String name, int weapon, boolean missile, int tire, int speed){
        this.name = name;
        this.weapon = weapon;
        this.missile = missile;
        this.tire = tire;
        this.speed = speed;
    }

    void movement(){
        System.out.println(name + " 이 " + speed + " 의 속도로 움직입니다.");
        System.out.println(tire+"륜 정상 작동중");
    }

    void printTank(){
        System.out.println("탱크의 종류: " + name );
        System.out.println("탱크에 탑재된 무기 번호: "+ weapon+"번 ");
        System.out.print("미사일 발사 유무: ");
        if(missile){
            System.out.println("가능");
        }
        else{
            System.out.println("불가능");
        }
        System.out.println("타이어의 개수: " + tire);
        System.out.println("평균 속도: "+speed+"km/h\n");
    }


}
