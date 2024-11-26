package com.example.SpringconnectMongoDb;
import com.example.SpringconnectMongoDb.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PdfReportService {

    public void generateReport(List<Contact> contacts, String filePath) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.beginText();
                contentStream.newLineAtOffset(50, 750);

                for (Contact contact : contacts) {
                    contentStream.showText(String.format("Ism: %s, Telefon: %s, Email: %s",
                            contact.getName(), contact.getPhoneNumber(), contact.getEmail()));
                    contentStream.newLineAtOffset(0, -15);
                }

                contentStream.endText();
            }

            document.save(filePath); // PDF hujjatini saqlash
        }
    }
}
