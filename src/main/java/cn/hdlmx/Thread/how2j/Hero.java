package cn.hdlmx.Thread.how2j;

public class Hero {

    private String name;
    private float hp;
    private int damage;

    public void attackHero(Hero hero) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, hero.name, hero.name, hero.hp);
        if (hero.isDead()) System.out.println(hero.name + "死了！");

    }


    public boolean isDead() {
        return 0 >= hp;
    }
}
