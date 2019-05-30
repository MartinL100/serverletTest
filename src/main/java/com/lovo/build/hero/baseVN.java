package com.lovo.build.hero;

public class baseVN implements IBuilder {
    Hero hero = new Hero();
    @Override
    public void creatKill() {
        this.hero.setKill("旋转跳跃");
    }

    @Override
    public void creatLv() {
    this.hero.setLv("0");
    }

    @Override
    public void createFace() {
    this.hero.setFace("丑陋的嘴脸");
    }

    @Override
    public Hero createHero() {
        return this.hero;
    }
}
