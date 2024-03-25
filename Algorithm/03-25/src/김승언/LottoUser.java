package org.example.day05.util;

public class LottoUser {
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.mix();
        for(int i = 0; i < 6; i++){
            Ball ball = lottoMachine.getBall();
            System.out.print(ball.number+"  ");
        }
    }
}
