package Q1a;
public class DocumentoFactory {
    public static Documento criarDocumento(String formato) {
        switch (formato.toLowerCase()) {
            case "pdf":
                return new PDFDocumento();
            case "docx":
                return new DOCXDocumento();
            case "html":
                return new HTMLDocumento();
            default:
                throw new IllegalArgumentException("Formato desconhecido:" + formato);
        }
    }
}

