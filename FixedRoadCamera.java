// Внести изменения в программу RoadCamera.java 
// 1) Исправить программу, чтобы она не штрафовала водителей если скорость не превышает 60 км/ч;
// 2) Увеличить размер штрафа в 2 раза.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixedRoadCamera {
    public static void main(String[] args) throws IOException {
        //Параметры программы
        int maxOncomingSpeed = 60; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 1000; // RUB
        int criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        } else {
            System.out.println("Скорость не превышена");
        }
    }
}