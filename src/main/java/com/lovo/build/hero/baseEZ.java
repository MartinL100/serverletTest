package com.lovo.build.hero;

public class baseEZ implements IBuilder {
    Hero hero = new Hero();
    @Override
    public void creatKill() {
        hero.setKill("探险");
    }

    @Override
    public void creatLv() {
        hero.setLv("99");
    }

    @Override
    public void createFace() {
    hero.setFace("足球先生");
    }

    @Override
    public Hero createHero() {
        return this.hero;
    }
}
