package Q1b;

public class DocumentoFactory {
    public static Documento criarDocumento(String formato) {
        switch (formato.toLowerCase()) {
            case "pdf":
                return new PDFDocumento();
            case "docx":
                return new DOCXDocumento();
            case "html":
                return new HTMLDocumento();
            case "markdown":
                return new MDocumento();
            default:
                throw new IllegalArgumentException("formato desconhecido:" + formato);
        }
    }
}

