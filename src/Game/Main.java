package Game;


import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            while(true){
//                System.out.println("""
//
//                        """);
                System.out.println("-----------------------------------------------------");
                System.out.println("| Добро пожаловать в меню! Выберите желаемый пункт: |");
                System.out.println("| 1. Пойти охотится на мышей.                       |");
                System.out.println("| 2. Пойти отжимать мышей у котов.                  |");
                System.out.println("| 0. Пойти чилить.                                  |");
                System.out.println("-----------------------------------------------------");
                int menu = sc.nextInt();
                switch (menu){
                    case 1:
                        Cats.test();
                        break;
                    case 2:
                        GopStop.thief();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Что то не то");
                }
            }
        }
    }

