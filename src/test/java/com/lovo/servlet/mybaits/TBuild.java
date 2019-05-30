package com.lovo.servlet.mybaits;

import org.junit.Test;

public class TBuild {

    @Test
    public void testBuilder(){
        //创建构建者
        HeroBuilder heroBuilder = new VNBase();
        //生产者
        MakeHero makeHero = new MakeHero(heroBuilder);

        //生产英雄
        Hero hero=makeHero.getHero();

        System.out.print(hero.getKill());
    }
}

