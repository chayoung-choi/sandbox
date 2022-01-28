package com.eden.sandbox.pdf;

import com.eden.sandbox.aop.LogExecutionTime;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/pdf")
@Log4j2
public class PdfController {

  @GetMapping("/info")
  @LogExecutionTime
  public String getPdfInfo(){

    log.info("pdf");
    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "pdf 파일";
  }

  @GetMapping("/convert")
  public String convertPdf(@RequestParam(value = "fileName") String fileName){

    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "";
  }
}
