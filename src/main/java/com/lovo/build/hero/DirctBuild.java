package com.lovo.build.hero;

public class DirctBuild {
    IBuilder builder ;
    public DirctBuild(IBuilder builder){
        this.builder=builder;
    }
    public Hero CreateHero(){
        builder.creatKill();
        builder.createFace();
        builder.creatLv();
        return  builder.createHero();
    }
}
