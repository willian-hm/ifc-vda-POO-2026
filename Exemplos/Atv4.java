/* Faça um programa que receba
• O código do produto comprado;
• A quantidade comprada do produto
Calcule e mostre:
• O preço unitário do produto comprado, seguindo a Tabela I;
• O preço total da nota;
• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
• O preço final da nota depois do desconto.
Tabela I
Código Preço
1 a 10 R$ 10,00
11 a 20 R$ 15,00
21 a 30 R$ 20,00
31 a 40 R$ 40,00 

Tabela II
Preço Total da Nota % de Desconto
Até R$ 250,00 5%
Entre R250, 00eR 500,00 10%
Acima de R$ 500,00 15%
*/


import java.util.Scanner;

public class Atv4{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cod;
        int quant = 0;
        float precoUnit = 0;
        float precoTotal = 0;
        float desconto = 0;
        float precoFinal = 0;

        System.out.println("Código do produto: ");
        cod = teclado.nextInt();

        System.out.println("Quantidade comprada: ");
        quant = teclado.nextInt();

        if(cod >= 1 && cod <= 10)
        {
            precoUnit = 10;
        }
        else if (cod <= 20)
        {
            precoUnit = 15;
        }
        else if (cod <= 30)
        {
            precoUnit = 20;
        }
        else if (cod <= 40)
        {
            precoUnit = 40;
        }

        precoTotal = quant * precoUnit;

        if(precoTotal <= 250)
        {
            desconto = (float)(precoTotal * 0.05);
        }
        else if(precoTotal <= 500)
        {
            desconto = (float)(precoTotal * 0.1);
        }
        else
        {
            desconto = (float)(precoTotal * 0.15); 
        }

        precoFinal = precoTotal - desconto;

        System.out.println("Preco unitario: "+precoUnit);
        System.out.println("Valor total da nota: "+precoTotal);
        System.out.println("Valor do desconto: "+desconto);
        System.out.println("Valor da nota com desconto: "+precoFinal);

        teclado.close();
    }
}