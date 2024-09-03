package org.designpattern.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow cloning
        //output
        //org.designpattern.prototype.Game@1b28cdfa
        //org.designpattern.prototype.Game@1b28cdfa

        // Deep Cloning
        //Output
        //Game{Id=1, name='Gopal', memberShip=org.designpattern.prototype.MemberShip@7ef20235}
        //Game{Id=1, name='Gopal', memberShip=org.designpattern.prototype.MemberShip@27d6c5e0}
        //Game{Id=1, name='Gopal', memberShip=org.designpattern.prototype.MemberShip@4f3f5b24}

        Game game = new Game();
        game.setId(1);
        game.setName("Gopal");
        game.setMemberShip(new MemberShip());

        Game game1 = (Game) game.clone();

        Game game2 =  new Game(game);

        System.out.println(game1);
        System.out.println(game);
        System.out.println(game2);
    }
}
