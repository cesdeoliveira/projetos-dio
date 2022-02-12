package exercicios.areas;

public class Quadrilateros {
    // calcula a área do quadrado dado o seu lado.
    public static float area(float lado){
        float areaQuad = lado * lado;
        return areaQuad;
    }
    // calcula a área do retângulo dados os seus lados.
    public static float area(float lado1, float lado2){
        float areaRet = lado1 * lado2;
        return areaRet;
    }
    // calcula a área do trapézio dados a base maior, base menor e altura.
    public static float area(float baseMenor, float baseMaior, float altura){
        float areaTrap = (baseMaior + baseMenor)*(altura/2);
        return areaTrap;
    }
}
