public class PrincipalQuadradoMagico {
    public static void main(String[] args) {
        int[][] m1 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int[][] m2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mRepetida = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };

        System.out.println("Matriz 1 eh quadrado magico? " + QuadradoMagico.ehQuadradoMagico(m1));
        System.out.println("Matriz 2 eh quadrado magico? " + QuadradoMagico.ehQuadradoMagico(m2));
        System.out.println("Matriz com repetidos eh quadrado magico? " + QuadradoMagico.ehQuadradoMagico(mRepetida));
    }
}
