package designpattern.templatecallback;

public class Solider {
    void runContext(String strategy) {
        System.out.println("전투 시작");

        executeWeapon(strategy).runStrategy();

        System.out.println("전투 종료");
        System.out.println();
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }

}
