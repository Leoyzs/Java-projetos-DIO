public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("23564456");
            System.out.println(meuCepFormatado);
        } catch (CepException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepException {
        if (cep.length() != 8) {
            throw new CepException();
        }
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }

    public static class CepException extends Exception {
        public CepException() {
            super("CEP inválido.");
        }
    }
}
