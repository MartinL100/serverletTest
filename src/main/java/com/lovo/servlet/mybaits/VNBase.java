package com.lovo.servlet.mybaits;

/**
 * 构建普通版的vn
 */
public class VNBase implements HeroBuilder{
    //持有英雄,创建product
    Hero hero = new Hero();
    @Override
    public void buildPymbol() {
        hero.setPymbol("AD");

    }

    @Override
    public void buildKill() {
        hero.setKill("圣盈弩箭");

    }

    @Override
    public void buildKien() {
        hero.setKien("原始皮肤");
    }
     public Hero createHero(){
        return this.hero;
     }
}
