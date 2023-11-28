package jp.ac.uryukyu.ie.e235715;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest() {
        int finalSlimeHp = 1; 
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 451, 100);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkill(slime);
        }
        assertEquals(finalSlimeHp, slime.getHitpoint());
    }
}
