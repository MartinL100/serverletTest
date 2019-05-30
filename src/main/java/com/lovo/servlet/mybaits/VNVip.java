package com.lovo.servlet.mybaits;

public class VNVip implements HeroBuilder {

    Hero hero = new Hero();
    @Override
    public void buildPymbol() {
       hero.setPymbol("ALL");
    }

    @Override
    public void buildKill() {
    hero.setKill("霸气的一击");
    }

    @Override
    public void buildKien() {
     hero.setKien("彩虹马");
    }
    public Hero createHero(){
        return this.hero;
    }
}
