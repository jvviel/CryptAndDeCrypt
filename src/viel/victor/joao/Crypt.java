package viel.victor.joao;

public class Crypt {

	private static final String pwd = "mandioca";

    public String cryptHexa(String chave) {
        String cript = "";
        String b = "";
        String p = "";
        int j = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for (int i = 0; i < pwd.length(); i++) {
            p += (int) pwd.charAt(i);
        }
        for (int i = 0; i < chave.length(); i++) {
            a1 = (int) p.charAt(j);
            j++;
            if (j == p.length()) {
                j = 0;
            }
            a2 = (int) chave.charAt(i);
            a3 = a1 ^ a2;
            b = Integer.toHexString(a3);
            if (b.length() < 2) {
                b = "0" + b;
            }
            cript += b;
        }
        return cript;
    }

    public String deCryptHexa(String chave) {
        String decript = "";
        String b = "";
        String p = "";
        int j = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for (int i = 0; i < pwd.length(); i++) {
            p += (int) pwd.charAt(i);
        }
        for (int i = 0; i < chave.length(); i += 2) {
            a1 = (int) p.charAt(j);
            j++;
            if (j == p.length()) {
                j = 0;
            }
            b = chave.substring(i, i + 2);
            a3 = Integer.parseInt(b, 16);
            a2 = a1 ^ a3;
            decript += (char) a2;
        }
        return decript;
    }

}
