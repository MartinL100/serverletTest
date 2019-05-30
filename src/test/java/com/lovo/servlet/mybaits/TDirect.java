package com.lovo.servlet.mybaits;

import com.lovo.build.hero.*;
import com.lovo.build.hero.Hero;
import org.junit.Test;

public class TDirect {
    IBuilder builder=new baseVN();
    DirctBuild dirctBuild = new DirctBuild(builder);
    Hero hero = dirctBuild.CreateHero();
  @Test
    public void test(){
        System.out.println(hero.getFace()+hero.getKill()+hero.getLv());
    }

}
