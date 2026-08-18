void main() {
    Scanner sc = new Scanner(System.in);
    int num;
    int A = 2;
    System.out.println("Digite o Número : ");
    num = sc.nextInt();

    if (num % 2 ==  0) {
        System.out.println("Este Número é Par");
    }else {
        System.out.println("Este Número é ímpar");
        }
    if (num > 0){
        System.out.println("Este Número é positivo ");
    }else if(num < 0){
        System.out.println("Este Número é negativo");
    }else {
        System.out.println("Este Número é Neutro: ");
    }
    }
