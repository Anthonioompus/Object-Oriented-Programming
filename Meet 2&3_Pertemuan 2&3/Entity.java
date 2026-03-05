
package Pertemuan23;
public class Entity implements InterfaceEntity {
    private String nama;
    private double hp;
    private double attack;

    public Entity(String nama, double hp, double attack) {
        this.nama = nama;
        this.hp = hp + BASE_HP;
        this.attack = attack + BASE_ATTACK;
    }


    public void infoStatus() { 
        System.out.println("Nama   : " + nama);
        System.out.println("HP     : " + hp);
        System.out.println("Attack : " + attack);
    }
}
