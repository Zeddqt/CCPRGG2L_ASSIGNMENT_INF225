public class Weapon {
    String name;
    int damage;
    String rarity;



    public void weaponName() {
        System.out.println("Sword name: " + name);
    }

    public void weaponDamage() {
        System.out.println("damage: "+ damage);
    }

    public void weaponRarity() {
        System.out.println("rarity: "+ rarity);
    }

    public void addDamage(int additionalDamage){
        int newDamage= this.damage+ additionalDamage;
        System.out.println("Damage increase from: "+ damage + " to "+ newDamage );

        this.damage = newDamage;
    }

    public String showWeaponStats(){
        return this.name + "  " +this.rarity;
       
    } 
}
