package jp.ac.uryukyu.ie.e235715;

public class Warrior extends Hero {
    
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(!(isDead())){
            double attack = getAttack();
            int damage = (int) (attack * 1.5);
            System.out.printf("%sの攻撃!ウェポンスキルを発動!%sに%dのダメージを与えた!!\n",getName(),opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }

}
