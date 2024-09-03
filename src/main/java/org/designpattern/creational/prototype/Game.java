package org.designpattern.prototype;

import org.designpattern.prototype.MemberShip;

public class Game  implements Cloneable{

    private  int Id;
    private String name;
    private MemberShip memberShip;

    // Shallow cloning
 /*   @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Game) super.clone();
    }
*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMemberShip(new MemberShip());
        return game;
    }

    Game(){

    }

    Game (Game game){
        this.Id = game.Id;
        this.name = game.name;
        this.memberShip = new MemberShip();
    }
    public int Id() {
        return Id;
    }

    public Game setId(int id) {
        Id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Game setName(String name) {
        this.name = name;
        return this;
    }

    public MemberShip memberShip() {
        return memberShip;
    }

    public Game setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
        return this;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", memberShip=" + memberShip +
                '}';
    }
}
