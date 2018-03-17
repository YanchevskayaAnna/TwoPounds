public class Decision {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("£2 возможно составить следующим образом:");
        for (int x1 = 0; x1 <= 200; x1++) {
            for (int x2 = 0; x2 <= 100; x2++) {
                for (int x3 = 0; x3 <= 40; x3++){
                    for (int x4 = 0; x4 <= 20; x4++){
                        for (int x5 = 0; x5 <= 10; x5++){
                            for (int x6 = 0; x6 <= 10; x6++){
                                for (int x7 = 0; x7 <= 2; x7++){
                                    for (int x8 = 0; x8 <= 1; x8++){
                                        if ((x1 + 2*x2+ 5*x3 + 10*x4 + 20*x5 + 50*x6 + 100*x7 + 200*x8) == 200){
                                            count++;
                                            System.out.printf("%3d×1p + %3d×2p + %3d×5p + %3d×10p + %3d×20p + %3d×50p + %3d×£1 + %3d×£2%n", x1, x2, x3, x4, x5, x6, x7, x8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Количество найденных решений - " + count);
    }
}
