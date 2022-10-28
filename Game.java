interface Actions{
    public void speak();
    public void walk();
    public void attack();
    public void eat();
    public void egg();
    public void die();
}

class CreatureActions implements Actions{
    public void speak(){

    }
    public void walk(){

    }

    public void attack(){

    }

    public void eat(){

    }

    public void egg(){

    }

}

class Creature extends CreatureActions implements Actions{
    public void walk(){

    }

    public void eat(){

    }
}

class World{

    public void createCreature(){

    }
    
}