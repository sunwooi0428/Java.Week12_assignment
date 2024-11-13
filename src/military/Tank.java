package military;

class Tank {
    String name;
    int weapon;
    boolean missile;
    int tire;
    int speed;

    void printTank() {
        System.out.println("탱크의 종류: " + name);
        System.out.println("탱크에 탑재된 무기 번호: " + weapon + "번 ");
        System.out.print("미사일 발사 유무: ");
        if (missile) {
            System.out.println("가능");
        } else {
            System.out.println("불가능");
        }
    }

    void attack() {
        System.out.println("\n화기를 사용합니다.\n");
        if (weapon == 1) {
            System.out.println(weapon + "번 화기 사용");
            System.out.println("쾅\n");
        }
        if (weapon == 2) {
            System.out.println(weapon + "번 화기 사용");
            System.out.println("펑\n");
        }
        if (weapon == 3) {
            System.out.println(weapon + "번 화기 사용");
            System.out.println("미사일 발사!!");
            System.out.println("부와아아아아아아악\n");
        }


    }

}
