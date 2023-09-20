public class Fila {

    public void ImprimeDocumento() {

    };

    public void RemoveDocumento() {

    };

    public void RemoveTodosDocumento() {

    };

    private static Fila instancia;

    private Fila() {}

    public static Fila getInstance() {
        return instancia;
    }
}
