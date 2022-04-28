public class Calculadora{
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    
    // public int somar(int x, int y){
        
        // }
        
        public int somar(String s1, String s2){
            return Integer.parseInt(s1) + Integer.parseInt(s2);
        }
        
        public float somar(float f1, float f2){
            return f1 + f2;
        }
        
        
        public int somar(String s1, int a){
            return Integer.parseInt(s1) + a;
        }
        
        public int somar(int a, String s1){
            return  somar (s1, a);   
        }
        
        public int somar(int a, int b, int c){
            return somar(somar(a, b), c);
        }
        public int somar(int a, int b){
            // int res = a + b;
            // return res;    
            return a + b;
        }
        //varargs (existe desde a versão 5 do Java)
        public int somar(int... valores){
            System.out.println("varargs");
            int resultado = 0;
            for (int i = 0; i < valores.length; i++){
            resultado += valores[i];
        }
        return resultado;
    }

}