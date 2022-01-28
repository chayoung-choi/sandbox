package com.eden.sandbox.pdf;

import com.eden.sandbox.aop.LogExecutionTime;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@Api(tags = {"PDF 관련 기능 Controller"})
@RestController
@RequestMapping("/pdf")
@Log4j2
public class PdfController {

  @ApiOperation(value = "PDF 정보 가져오기")
//  @ApiImplicitParam(name = "tagIds", value = "검색할 태그 ID를 담은 리스트", dataType = "list")
  @GetMapping("/info")
  @LogExecutionTime
  public String getPdfInfo(){

    log.info("pdf");
    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "pdf 파일";
  }

  @ApiOperation(value = "조건에 맞는 게시글 목록을 반환하는 메소드")
  @ApiImplicitParam(name = "tagIds", value = "검색할 태그 ID를 담은 리스트", dataType = "list")
  @GetMapping("/convert/{fileName}")
  public String convertPdf(@PathVariable String fileName){

    //    File file = new File("pdf파일의위치");
//    PDDocument document = PDDocument.load(file);
//    PDFRenderer pdfRenderer = new PDFRenderer(pdfDoc);

    return "Response!!! >> " + fileName;
  }
}
