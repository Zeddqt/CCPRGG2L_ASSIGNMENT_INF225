public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.attack();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.attack();

        Weapon sword = new Weapon();
        sword.name= "qwerty";
        sword.damage= 100;
        sword.rarity= "super-rare";
        sword.weaponName();
        sword.weaponDamage();
        sword.weaponRarity();
        sword.addDamage(150);
        System.out.println(sword.showWeaponStats());
        
    }
}
