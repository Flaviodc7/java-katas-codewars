public class TwoFightersOneWinner {

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        char turn = 'a';
        do {
            if (turn == 'a'){
                if (fighter1.name.equals(firstAttacker))
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                else fighter1.health = fighter1.health - fighter2.damagePerAttack;
                turn = 'b';
            } else {
                if (!fighter2.name.equals(firstAttacker))
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                else fighter2.health = fighter2.health - fighter1.damagePerAttack;
                turn = 'a';
            }
        } while (fighter1.health > 0 && fighter2.health > 0);
        return fighter1.health > 0 ? fighter1.name : fighter2.name;
    }

    public static void main(String[] args){
        String winner = TwoFightersOneWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry");
        System.out.println(winner);
    }
}