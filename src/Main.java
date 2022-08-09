public class Main
{
    public static void main(String[] args)
    {
        int moneyAmount = 180; // Сколько денег внесли в кофемашину
        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;
        boolean canBuyAnything = false;
        boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;

        if (moneyEnoughForCappucino && isMilkEnough) // && - оператор и; || - оператор или; ! - оператор не(изменение значения переменной на противоположное)
        {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrice && isMilkEnough)
        {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice)
        {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice)
        {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if(!canBuyAnything)
        {
            System.out.println("Недостаточно средств!");
        }
    }
}

//        System.out.println(canBuyAnything ? "Выберите напиток" : "Недостаточно средств!") - вместо if и else - ? и :
