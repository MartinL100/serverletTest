package com.lovo.servlet.mybaits;

/**
 * 英雄制作者 director
 */
public class MakeHero {
    private HeroBuilder heroBuilder;

    public MakeHero (HeroBuilder heroBuilder) {
        this.heroBuilder=heroBuilder;
    }
    //开始构建
    public  void build(){
        heroBuilder.buildKien();
        heroBuilder.buildKill();
        heroBuilder.buildPymbol();
    }

    public Hero getHero(){
        return heroBuilder.createHero();
    }
}
