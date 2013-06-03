/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.admin.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfAction;
import com.lowagie.text.pdf.PdfDestination;
import com.lowagie.text.pdf.PdfWriter;
import java.util.List;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.entities.Orphanage;
// import com.percipient.bean.Student;

public class RichOrphanagePDFView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model,
            Document document, PdfWriter writer, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Orphanage> orphanages = OrphanageDAO.listOrphanages();

        Table table = new Table(2);
        table.addCell("Center Name");
        table.addCell("Email address");


        for (Orphanage o : orphanages) {
            table.addCell(o.getName());
            table.addCell("Email address");
        }
        
        document.add(table);

        // to open the PDF in 100% zoom
        writer.setOpenAction(PdfAction.gotoLocalPage(1, new PdfDestination(
                PdfDestination.XYZ, 0, 10000, 1), writer));
    }
}